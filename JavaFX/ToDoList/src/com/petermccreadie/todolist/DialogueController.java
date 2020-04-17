package com.petermccreadie.todolist;

import com.petermccreadie.todolist.datamodel.TodoData;
import com.petermccreadie.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Optional;

public class DialogueController {
    @FXML
    private TextField shortDescriptionField;
    @FXML
    private TextArea detailsArea;
    @FXML
    private DatePicker deadlinePicker;
    @FXML
    private BorderPane mainBorderPane;
    @FXML
    private ListView<TodoItem> todoListView;



    public TodoItem processResults(){
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = deadlinePicker.getValue();

        TodoItem newItem = new TodoItem(shortDescription, details, deadlineValue);
        TodoData.getInstance().addTodoItem(newItem);
        return newItem;

    }


    @FXML
    public void editTodoItem(TodoItem item){

        String description = item.getShortDescription();
        String details = item.getDetails();

        Dialog<ButtonType> dialogue = new Dialog<>();

        dialogue.setTitle("Edit current Todo Item");
        dialogue.setHeaderText("Use this dialog to edit the current Todo");
        FXMLLoader fxmlLoader = new FXMLLoader();
        // load reference the fxml file with an fxml loader. use the
        // setLocation method to set the path
        fxmlLoader.setLocation(getClass().getResource("todoItemDialogue.fxml"));
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




}
