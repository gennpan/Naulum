package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

public class applicationController implements Initializable{
	
	

	public void up(ActionEvent e) {
		System.out.println("Click on Up button!");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	@FXML    //Si collega all'FXMLLOADER e ci serve per creare un collegamento diretto con un il file fxml.
	private ImageView myImage;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//translate
		TranslateTransition translate = new TranslateTransition();
		translate.setNode(myImage);
		translate.setByX(250);
		translate.play();
		
	}
	
}
