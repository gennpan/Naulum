package com.naulum.fxgui.controllers;



import java.net.URL;
import com.naulum.fxgui.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class LoaderMenuController {
	private Pane view;
	
	
	
	public Pane getPage(String fileName) {
		
		try {
			URL fileUrl = Main.class.getResource("/com/naulum/fxgui/controllers/" + fileName + ".fxml");
			if(fileUrl == null) {
				throw new java.io.FileNotFoundException("FXML file can't be found");
			}
			
			//eliminato un warning, potrebbe dare problemi?
			new FXMLLoader();
			view = FXMLLoader.load(fileUrl);
			
		} catch (Exception e) {
			System.out.println("No page " + fileName + " Please check FxmlLoader.");
		}
		
		return view;
		
	}
	
}

