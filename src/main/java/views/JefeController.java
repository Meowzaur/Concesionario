package views;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class JefeController {

    @FXML
    private Button btEmpleado;

    @FXML
    private Button btMecanico;

    @FXML
    private ChoiceBox<?> chbEspecialidad;

    @FXML
    private CheckBox chk_RegistroUsuarioSi;

    @FXML
    private ImageView ivExit;

    @FXML
    private TextField txtRegistroUsuarioApellidos;

    @FXML
    private TextField txtRegistroUsuarioDNI;

    @FXML
    private TextField txtRegistroUsuarioDireccion;

    @FXML
    private TextField txtRegistroUsuarioNombre;

    @FXML
    private TextField txtRegistroUsuarioNumeroCuenta;

    @FXML
    private TextField txtRegistroUsuarioTelefono;

    @FXML
    private TextField txtReparacionesImporteTotalRecaudado;

    @FXML
    private TextField txtVehiculosVendidosImporteMediaVenta;

    @FXML
    private TextField txtVehiculosVendidosImporteTotalVendido;

    @FXML
    private TextField txtVehiculosVendidosMarcaMasVendida;

    @FXML
    private TextField txtVehiculosVendidosModeloMasVendido;

}
