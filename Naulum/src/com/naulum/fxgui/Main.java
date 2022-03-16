package com.naulum.fxgui;


	

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/com/naulum/fxgui/fxml/login.fxml"));
			Scene scene = new Scene(root);
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//this because with the other method it's recommended.
			
			String css = this.getClass().getResource("/com/naulum/fxgui/css/style.css").toExternalForm();
			scene.getStylesheets().add(css);
			stage.setScene(scene);
			stage.show();

			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
