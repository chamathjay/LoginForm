module org.example.tut1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.tut1 to javafx.fxml;
    exports org.example.tut1;
}