module vistas.tp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens vistas.tp to javafx.fxml;
    exports vistas.tp;
}