package vistas.tp;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static vistas.tp.Main.*;

public class AltaPolizaControlador {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField apellido;

    @FXML
    private Button botonBuscar;

    @FXML
    private Button botonCancelar;

    @FXML
    private Button botonLimpiar;

    @FXML
    private Label errorApellido;

    @FXML
    private Label errorNombre;

    @FXML
    private Label errorNroCliente;

    @FXML
    private Label errorNroDocumento;

    @FXML
    private Label errorTipoDocumento;

    @FXML
    private Button idBotonInicio;

    @FXML
    private TextField nombre;

    @FXML
    private TextField nroCliente;

    @FXML
    private TextField nroDocumento;

    @FXML
    private ComboBox<String> tipoDocumento;

    @FXML
    void irInterfazInicio(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ProdSegurosVentanaPrincipal.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("EL ASEGURADO");
        stage.setResizable(false);
        stage.show();
        Stage old = (Stage) idBotonInicio.getScene().getWindow();
        old.close();
    }

    @FXML
    void buscar(ActionEvent event) {
        if (validarFormato(nroCliente.getText()) || nroCliente.getText().isEmpty()){
            if (!nroCliente.getText().isEmpty()) {
                errorNroCliente.setText("ta bien loco quedate trank");
            } else {
                errorNroCliente.setText("ta vacía kbza algo anda mal");
            }
        } else {
            errorNroCliente.setText("Ingrese un Nro de Cliente válido.");
        }

        if ((nombre.getText().matches("[a-zA-ZáéíóúüÁÉÍÓÚÜ' ]*")) || (nroCliente.getText().isEmpty())) {
            if (!nombre.getText().isEmpty()) {
                errorNombre.setText("ta bien loco quedate trank");
            } else {
                errorNombre.setText("ta vacía kbza algo anda mal");
            }
        } else {
            errorNombre.setText("Ingrese un Nombre válido.");
        }

        if ((apellido.getText().matches("[a-zA-ZáéíóúüÁÉÍÓÚÜ' ]*")) || (nroCliente.getText().isEmpty())) {
            if (!apellido.getText().isEmpty()) {
                errorApellido.setText("ta bien loco quedate trank");
            } else {
                errorApellido.setText("ta vacía kbza algo anda mal");
            }
        } else {
            errorApellido.setText("Ingrese un Apellido válido.");
        }

        if (nroDocumento.getText().isEmpty() || nroDocumento.getText().matches("\\d+")) {
            if (!nroDocumento.getText().isEmpty()) {
                errorNroDocumento.setText("ta bien loco quedate trank");
            } else {
                errorNroDocumento.setText("ta vacía kbza algo anda mal");
            }
        } else {
            errorNroDocumento.setText("Ingrese un Nro Documento válido.");
        }
    }

    @FXML
    void cancelar(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ProdSegurosVentanaPrincipal.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("EL ASEGURADO");
        stage.setResizable(false);
        stage.show();
        Stage old = (Stage) idBotonInicio.getScene().getWindow();
        old.close();
    }
    @FXML
    void limpiar(ActionEvent event) {
        nroCliente.setText("");
        nombre.setText("");
        apellido.setText("");
        tipoDocumento.setValue("DNI");
        nroDocumento.setText("");
        errorNroCliente.setText("");
        errorNombre.setText("");
        errorApellido.setText("");
        errorTipoDocumento.setText("");
        errorNroDocumento.setText("");
    }

    @FXML
    void initialize() {
        assert apellido != null : "fx:id=\"apellido\" was not injected: check your FXML file 'AltaPoliza.fxml'.";
        assert botonBuscar != null : "fx:id=\"botonBuscar\" was not injected: check your FXML file 'AltaPoliza.fxml'.";
        assert botonCancelar != null : "fx:id=\"botonCancelar\" was not injected: check your FXML file 'AltaPoliza.fxml'.";
        assert botonLimpiar != null : "fx:id=\"botonLimpiar\" was not injected: check your FXML file 'AltaPoliza.fxml'.";
        assert errorApellido != null : "fx:id=\"errorApellido\" was not injected: check your FXML file 'AltaPoliza.fxml'.";
        assert errorNombre != null : "fx:id=\"errorNombre\" was not injected: check your FXML file 'AltaPoliza.fxml'.";
        assert errorNroCliente != null : "fx:id=\"errorNroCliente\" was not injected: check your FXML file 'AltaPoliza.fxml'.";
        assert errorNroDocumento != null : "fx:id=\"errorNroDocumento\" was not injected: check your FXML file 'AltaPoliza.fxml'.";
        assert errorTipoDocumento != null : "fx:id=\"errorTipoDocumento\" was not injected: check your FXML file 'AltaPoliza.fxml'.";
        assert idBotonInicio != null : "fx:id=\"idBotonInicio\" was not injected: check your FXML file 'AltaPoliza.fxml'.";
        assert nombre != null : "fx:id=\"nombre\" was not injected: check your FXML file 'AltaPoliza.fxml'.";
        assert nroCliente != null : "fx:id=\"nroCliente\" was not injected: check your FXML file 'AltaPoliza.fxml'.";
        assert nroDocumento != null : "fx:id=\"nroDocumento\" was not injected: check your FXML file 'AltaPoliza.fxml'.";
        assert tipoDocumento != null : "fx:id=\"tipoDocumento\" was not injected: check your FXML file 'AltaPoliza.fxml'.";

        tipoDocumento.getItems().addAll("DNI", "PASAPORTE", "LU", "LE");
        tipoDocumento.setValue("DNI");
    }
}
