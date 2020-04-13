package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

// extends application
// with JavaFX - you must extend Application in main
// which will act as the entry point for the application
// the class 'Application' manages the life cycle of the application
public class Main extends Application {

    @Override
    // primary stage - launches the main window
    // most applications only have one of these - more can lead to
    // a poor user experience
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        // manually code the grid layout without using the fxml file
//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);
//        root.setHgap(10);
//        // Generate a label
//        Label greeting = new Label("Welcome to JavaFX!");
//        greeting.setTextFill(Color.GREEN);
//        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
//        // add label control to grid pane
//        root.getChildren().add(greeting);


        primaryStage.setTitle("Hello JavaFX!");
        primaryStage.setScene(new Scene(root, 700, 275));
        // displays the content of the stage to the user
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }


}


