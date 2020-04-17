package com.petermccreadie.todolist;

import com.petermccreadie.todolist.datamodel.TodoData;
import com.petermccreadie.todolist.datamodel.TodoItem;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.util.Callback;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Controller {
    private List<TodoItem> todoItems;
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea itemDetailsTextArea;
    @FXML
    private Label deadlineLabel;
    @FXML
    private BorderPane mainBorderPane;
    @FXML
    private ContextMenu listContextMenu;
    @FXML
    private ToggleButton filterToggleButton;

    private FilteredList<TodoItem> filteredList;

    private Predicate<TodoItem> wantAllItems;
    private Predicate<TodoItem> wantTodaysItems;

    public void initialize() {

        listContextMenu = new ContextMenu();
        MenuItem deleteMenuItem = new MenuItem("Delete");
        deleteMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                deleteItem(item);
            }
        });


        // Add an edit button
        MenuItem editMenuItem = new MenuItem(("Edit"));
        editMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                editItem(item);
            }
        });

        // Generic event handler - new ChangeListener
        // anonymous class overriding the changed method
        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observable, TodoItem oldValue, TodoItem newValue) {
                if (newValue != null) {
                    TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                    itemDetailsTextArea.setText(item.getDetails());
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, yyyy");
                    deadlineLabel.setText(df.format(item.getDeadline()));
                }
            }
        });

        // filtered list will call the test method. When the test method returns true, the item
        // passes the filter and is added to the filtered list
        // Predicates are usually setup with lambda expressions but I don't know how to do those yet

        wantAllItems = new Predicate<TodoItem>() {
            @Override
            public boolean test(TodoItem item) {
                return true;
            }
        };

        wantTodaysItems = new Predicate<TodoItem>() {
            @Override
            public boolean test(TodoItem todoItem) {
                return (todoItem.getDeadline().equals(LocalDate.now()));
            }
        };

        filteredList = new FilteredList<TodoItem>(TodoData.getInstance().getTodoItems(), wantAllItems);

        SortedList<TodoItem> sortedList = new SortedList<TodoItem>(filteredList,
                new Comparator<TodoItem>() {
                    @Override
                    public int compare(TodoItem o1, TodoItem o2) {
                        return o1.getDeadline().compareTo(o2.getDeadline());
                    }
                });


        listContextMenu.getItems().addAll(deleteMenuItem);
        listContextMenu.getItems().add(editMenuItem);

        // Bind the list view to the observable list in the toDoData class
//        todoListView.setItems(TodoData.getInstance().getTodoItems());
        todoListView.setItems(sortedList);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();



        // Anonymous class which implements the callback interface
        // the callback interface is part of the JavaFX API
        todoListView.setCellFactory(new Callback<ListView<TodoItem>, ListCell<TodoItem>>() {
            @Override
            public ListCell<TodoItem> call(ListView<TodoItem> todoItemListView) {
                ListCell<TodoItem> cell = new ListCell<>() {
                    @Override
                    protected void updateItem(TodoItem item, boolean empty) {
                        super.updateItem(item, empty);
                        if(empty){
                            setText(null);
                        }else{
                            setText(item.getShortDescription());
                            if(item.getDeadline().isBefore(LocalDate.now().plusDays(1))){
                                setTextFill(Color.RED);
                            } else if (item.getDeadline().equals(LocalDate.now().plusDays(1))){
                                setTextFill(Color.BROWN);
                            }
                        }
                    }
                };
                cell.emptyProperty().addListener(
                        (obs, wasEmpty, isNowEmpty) -> {
                            if(isNowEmpty){
                                cell.setContextMenu(null);
                            }else{
                                cell.setContextMenu(listContextMenu);
                            }
                        }
                );
                return cell;
            }
        });
    }

    @FXML
    public void showNewItemDialogue(){
        Dialog<ButtonType> dialogue = new Dialog<>();
        // new scene
        dialogue.initOwner(mainBorderPane.getScene().getWindow());
        dialogue.setTitle("Add New Todo Item");
        dialogue.setHeaderText("Use this dialog to create todo item");
        FXMLLoader fxmlLoader = new FXMLLoader();
        // load reference the fxml file with an fxml loader. use the
        // setLocation method to set the path
        fxmlLoader.setLocation(getClass().getResource("todoItemDialogue.fxml"));

        // the load method can throw an IO exception, so you need try catch
        try{
            // reference the fxml loader created above
            dialogue.getDialogPane().setContent(fxmlLoader.load());

        }catch(IOException e){
            System.out.println("Couldn't load the dialogue");
            e.printStackTrace();
            return;
        }

        dialogue.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialogue.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialogue.showAndWait();
        if(result.isPresent() && result.get()== ButtonType.OK){
            DialogueController controller = fxmlLoader.getController();
            TodoItem newItem = controller.processResults();
            todoListView.getSelectionModel().select(newItem);
        }

    }

    @FXML
    public void handleExit(){
        Platform.exit();
    }

    @FXML
    public void handleKeyPressed(KeyEvent keyEvent){
        TodoItem selectedItem = todoListView.getSelectionModel().getSelectedItem();
        if(selectedItem != null){
            if(keyEvent.getCode().equals(KeyCode.DELETE)){
                deleteItem(selectedItem);
            }
        }
    }
    @FXML
    public void handleClickListView() {
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText(item.getDetails());
        deadlineLabel.setText(item.getDeadline().toString());

    }

    @FXML
    public void editItem(TodoItem item){
        DialogueController dc = new DialogueController();
        dc.editTodoItem(item);

    }

    public void deleteItem(TodoItem item){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete Todo Item");
        alert.setHeaderText("Delete item: " + item.getShortDescription());
        alert.setContentText("Are you sure? Press OK to confirm or cancel.");

        Optional<ButtonType> result = alert.showAndWait();
        if(result.isPresent() && (result.get() == ButtonType.OK)){
            TodoData.getInstance().deleteTodoItem(item);
        }
    }

    @FXML
    public void handleFilterButton(){
        TodoItem selectedItem = todoListView.getSelectionModel().getSelectedItem();

        if(filterToggleButton.isSelected()){
            // return items with a deadline of today only
            filteredList.setPredicate(wantTodaysItems);
            if(filteredList.isEmpty()){
                itemDetailsTextArea.clear();
                deadlineLabel.setText("Empty");
            }else if (filteredList.contains(selectedItem)){
                todoListView.getSelectionModel().select(selectedItem);
            }else{
                todoListView.getSelectionModel().selectFirst();
            }
        }else{
            filteredList.setPredicate(wantAllItems);
            todoListView.getSelectionModel().select(selectedItem);

        }
    }
}

