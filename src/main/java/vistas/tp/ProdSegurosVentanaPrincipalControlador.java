package vistas.tp;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ProdSegurosVentanaPrincipalControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button idBotonAltaPoliza;

    @FXML
    void irInterfazAltaPoliza(Event event) throws IOException {
        //Para crear una ventana necesitas un nuevo Stage (Escenario)
        Stage stage = new Stage();
        //Cargas el FXML que queres que abra en un Parent
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AltaPoliza.fxml")));
        //Se declara una Scene y se le asigna el FXML (Una Scene es la ventana)
        Scene scene = new Scene(root);
        //Establecemos la scena en el Stage
        stage.setScene(scene);
        //titulo para la ventana
        stage.setTitle("EL ASEGURADO");
        //El formulario se muestra
        stage.setResizable(false);
        stage.show();
        //Cerramos la ventana anterior de Login. La obtenemos a partir de un control (Button)
        Stage old = (Stage) idBotonAltaPoliza.getScene().getWindow();
        old.close();
    }

    @FXML
    void initialize() {
        assert idBotonAltaPoliza != null : "fx:id=\"idBotonAltaPoliza\" was not injected: check your FXML file 'ProdSegurosVentanaPrincipal.fxml'.";

    }

}