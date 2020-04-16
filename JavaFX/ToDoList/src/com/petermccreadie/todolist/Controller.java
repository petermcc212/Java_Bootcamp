package com.petermccreadie.todolist;

import com.petermccreadie.todolist.datamodel.TodoData;
import com.petermccreadie.todolist.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.util.Callback;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

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



    public void initialize() {
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

        // Bind the list view to the observable list in the toDoData class
        todoListView.setItems(TodoData.getInstance().getTodoItems());
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
                return cell;
            }
        });
    }


    @FXML
    public void test(){
        System.out.println("IT WORKS");
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
    public void handleClickListView() {
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText(item.getDetails());
        deadlineLabel.setText(item.getDeadline().toString());

    }


}

