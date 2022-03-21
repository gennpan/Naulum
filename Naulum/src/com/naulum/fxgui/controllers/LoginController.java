package com.naulum.fxgui.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Node;


public class LoginController implements Initializable {
	
	@FXML
	private Stage stage;
	@FXML
	private Scene scene;
	@FXML
	private ImageView ebikeFrame;
	@FXML
	private Button btl;
	@FXML
	private TextField textForm;
	@FXML
	private AnchorPane anchor_pane;  
	

	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//translate
				TranslateTransition translate = new TranslateTransition();
				translate.setNode(ebikeFrame);
				translate.setDuration(Duration.millis(1000));
				translate.setCycleCount(TranslateTransition.INDEFINITE);
				translate.setByX(250);
				translate.setAutoReverse(true);
				translate.play();
	}
	
		
		public void switchToSignUp(ActionEvent event) throws IOException{
			System.out.println("You have Clicked SignUp");
			Parent root = FXMLLoader.load(getClass().getResource("/com/naulum/fxgui/controllers/Sign_up.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}

	    public void switchToHome(ActionEvent event) throws IOException {
	    	System.out.println("You have Clicked Login");
			Parent root = FXMLLoader.load(getClass().getResource("/com/naulum/fxgui/controllers/UserHome.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
	}
}





