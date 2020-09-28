package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label label;

    @FXML
    public void handleAction(){
        label.setText("OK button pressed");
    }

    @FXML
    public void exitApp(){
        Platform.exit();
    }

}
