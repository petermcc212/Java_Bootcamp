package com.petermccreadie.todolist;

import com.petermccreadie.todolist.datamodel.TodoData;
import com.petermccreadie.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {

    @FXML
    private TextField shortDescriptionField;

    @FXML
    private TextArea detailsArea;

    @FXML
    private DatePicker deadlinePicker;

    public TodoItem processResults() {
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = deadlinePicker.getValue();

        TodoItem newItem = new TodoItem(shortDescription, details, deadlineValue);
        TodoData.getInstance().addTodoItem(newItem);
        return newItem;
    }

    public TodoItem editItem(TodoItem todoItem){

        // set current toTo item in relevant fields
        shortDescriptionField.setText(todoItem.getShortDescription());
        detailsArea.setText(todoItem.getDetails());
        deadlinePicker.setValue(todoItem.getDeadline());

        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = deadlinePicker.getValue();

        return todoItem;

    }



}

