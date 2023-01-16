package views;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
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
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/Mecanico.fxml"));
		root = loader.load();
		
		MecanicoController mControl = loader.getController();
		Scene escena = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(escena);
		//mControl.init();
		stage.show();
		
    }
	
	public void setStage(Stage primaryStage) {
		stage = primaryStage;
	}

}
