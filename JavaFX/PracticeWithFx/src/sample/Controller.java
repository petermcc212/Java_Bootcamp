package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField pmtextBox;
    @FXML
    private Button helloButton;
    @FXML
    private Button goodnightButton;


    @FXML
    public void onButtonClicked(ActionEvent e){
        String fromuser = pmtextBox.getText();
        if (e.getSource().equals(helloButton)){
            System.out.println("Hello " + fromuser);
        } else if(e.getSource().equals(goodnightButton)){
            System.out.println("Goodnight " + fromuser);
        }
    }




}
