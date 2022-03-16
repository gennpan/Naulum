package com.naulum.fxgui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class appController implements Initializable{
	
	
	
	
	
	@FXML    //Si collega all'FXMLLOADER e ci serve per creare un collegamento diretto con un il file fxml.
	private ImageView ebikeLogin;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		//translate
		TranslateTransition translate = new TranslateTransition();
		translate.setNode(ebikeLogin);
		translate.setDuration(Duration.millis(1000));
		translate.setCycleCount(TranslateTransition.INDEFINITE);
		translate.setByX(250);
		translate.setAutoReverse(true);
		translate.play();
	
		
	}
	
}
