package views;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class MecanicoController {

    @FXML
    private Button btnReparado;

    @FXML
    private ChoiceBox<?> chbNombre;

    @FXML
    private ImageView ivAtras;

    @FXML
    private ImageView ivSalir;

    @FXML
    private ImageView ivSiguiente;

    @FXML
    private ImageView ivVistaJefe;

    @FXML
    private Label lbVistaJefe;

    @FXML
    private TextField txtAveria;

    @FXML
    private TextField txtEspecialidad;

    @FXML
    private TextField txtFechaEntrada;

    @FXML
    private TextField txtFechaSalida;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtMatricula;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtNumReparacion;

    @FXML
    private TextField txtPresupuesto;

    @FXML
    private TextField txtTiempo;

}
