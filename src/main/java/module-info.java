module com.example.builderpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.builderpattern to javafx.fxml;
    exports com.example.builderpattern;
}