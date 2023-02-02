package views;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;

import dao.UsuarioDaoImpl;
import dao.UsuarioDaoInt;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import models.Usuario;
import utils.HibernateUtil;
import javafx.scene.control.CheckBox;

public class LoginController {

	public static BorderPane root;
	private Stage stage;

	@FXML
	private TextField txtUsuario;
	@FXML
	private TextField txtPassword;
	@FXML
	private Button bt_login;
	@FXML
	private CheckBox chk_remeber;

	@FXML
	void actionLogin(ActionEvent event) throws IOException {
		// Pruebas hibernate
		// Inicio la sesi�n
		final Session session = HibernateUtil.getSessionFactory().openSession();

		// Inicio los servicios
		// ClientManagementServiceI clientService = new
		// ClientManagementServiceImpl(session);
		// ContractManagementServiceI contractService = new
		// ContractManagementServiceImpl(session);

		// Ejemplo de select sobre usuario
		UsuarioDaoInt usuarioDao = new UsuarioDaoImpl(session);

		Usuario u = usuarioDao.searchByDNI(txtUsuario.getText());

		if (u == null) {
			System.out.println("El usuario no existe.");
		} else if (u.getPassword().equals(txtPassword.getText())) {
			FXMLLoader loader = null;
			if (u.getId() == 1) {
				loader = new FXMLLoader(getClass().getResource("../views/Mecanico.fxml"));
				MecanicoController mControl = loader.getController();
			} else if (u.getId() == 2) {
				loader = new FXMLLoader(getClass().getResource("../views/Ventas.fxml"));
				VentasController vControl = loader.getController();
			} else if (u.getId() == 3) {
				loader = new FXMLLoader(getClass().getResource("../views/Jefe.fxml"));
				JefeController jControl = loader.getController();
			}
			root = loader.load();
			
			Scene escena = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(escena);
			// mControl.init();
			stage.show();
		} else {
			System.out.println("Password incorrecto.");
		}

	}

	public void setStage(Stage primaryStage) {
		stage = primaryStage;
	}

}
