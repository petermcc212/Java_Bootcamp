package com.petermccreadie.todolist.datamodel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

// This is a singleton class
// A singleton is used when we want only one instance of a class created over the
// entire run of the program.

public class TodoData {

    // Create the singleton
    // i.e. the single instance of this class
    private static TodoData instance = new TodoData();
    // Create a filename
    private static String filename = "TodoListItems.txt";
    // List of to do items - we use observable list
    // to improve data binding - a normal list would work but data could get out of sync
    private ObservableList<TodoItem> todoItems;
    private DateTimeFormatter formatter;

    // public method to return the only instance of our TodoData class
    // It is conventional in a singleton class to name the method
    // getInstance() when creating the method which returns the singleton
    public static TodoData getInstance(){
        return instance;
    }
// private constructor stops other classes making an instance of this class
    private TodoData(){
        formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
    }

    // Method to return items
    public ObservableList<TodoItem> getTodoItems() {
        return todoItems;
    }

    public void addTodoItem(TodoItem item){
        todoItems.add(item);
    }


    // set to do list items - temp for testing
//    public void setTodoItems(List<TodoItem> todoItems) {
//        this.todoItems = todoItems;
//    }

    public void loadTodoitem() throws IOException{

        // JavaFX needs an observableArray List format so we do this:
        todoItems = FXCollections.observableArrayList();
        // get the path for the file to load
        Path path = Paths.get(filename);
        // creating a new buffered reader for the file
        BufferedReader br = Files.newBufferedReader(path);

        String input;
        try{
            while((input = br.readLine())!= null){
                String[] itemPieces = input.split("\t");
                String shortDescription = itemPieces[0];
                String details = itemPieces[1];
                String dateString = itemPieces[2];
                LocalDate date = LocalDate.parse(dateString, formatter);
                TodoItem todoItem = new TodoItem(shortDescription, details, date);
                todoItems.add(todoItem);
            }
        } finally{
            if(br != null){
                br.close();
            }
        }
    }

    public void storeTodoItems() throws IOException{
        Path path = Paths.get(filename);
        BufferedWriter bw = Files.newBufferedWriter(path);
        try{
            Iterator<TodoItem> iter = todoItems.iterator();
            while(iter.hasNext()){
                TodoItem item = iter.next();
                bw.write(String.format("%s\t%s\t%s",
                    item.getShortDescription(),
                    item.getDetails(),
                    item.getDeadline().format(formatter)));
                bw.newLine();

            }
        } finally{
            if (bw!= null){
                bw.close();
            }
        }
    }


}
