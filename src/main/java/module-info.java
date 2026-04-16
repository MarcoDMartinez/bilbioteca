module com.example.mvcsesion {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.mvcsesion to javafx.fxml;
    exports com.example.mvcsesion;
    exports com.example.mvcsesion.controller;
    opens com.example.mvcsesion.controller to javafx.fxml;
}