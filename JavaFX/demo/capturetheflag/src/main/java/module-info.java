module com.example.capturetheflag {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.capturetheflag to javafx.fxml;
    exports com.example.capturetheflag;
}