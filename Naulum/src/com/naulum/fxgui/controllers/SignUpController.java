package com.naulum.fxgui.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Node;

public class SignUpController implements Initializable {
	
	@FXML
	private Stage stage;
	@FXML
	private Scene scene;
	@FXML
	private AnchorPane anchor_pane;  
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//possibili animation qui
	}
	        public void switchToLogin(ActionEvent event) throws IOException {
			Parent root = FXMLLoader.load(getClass().getResource("/com/naulum/fxgui/controllers/Login.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
	}
}