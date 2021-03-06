
//Inserire la funzione per aggiungere il credito e scegliere le carte tra quelle inserite in wallet.
//Controllare il pulsante Credit in add Credit, non sembra tornare indietro, da errore.





package com.naulum.fxgui.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HandlerMenuController implements Initializable{
	
	@FXML
	private BorderPane main_pane;
	@FXML
	private Stage stage;
	@FXML
	private Scene scene;

	//NavMenu with view.
	@FXML
	private void handleButtonRent(ActionEvent event) {
		System.out.println("You have Clicked Rent");
		LoaderMenuController object = new LoaderMenuController();
		Pane view = object.getPage("Rent");
		main_pane.setCenter(view);
	}
	
	
	@FXML
	private void handleButtonCredit(ActionEvent event) {
		System.out.println("You have Clicked Credit");
		LoaderMenuController object = new LoaderMenuController();
		Pane view = object.getPage("Credit");
		main_pane.setCenter(view);
	}
	
	
	@FXML
	private void handleButtonWallet(ActionEvent event) {
		System.out.println("You have Clicked Wallet");
		LoaderMenuController object = new LoaderMenuController();
		Pane view = object.getPage("Wallet");
		main_pane.setCenter(view);
	}
	
	
	
	@FXML
	private void handleButtonSH(ActionEvent event) {
		System.out.println("You have Clicked Scooter-History");
		LoaderMenuController object = new LoaderMenuController();
		Pane view = object.getPage("ScooterHistory");
		main_pane.setCenter(view);
	}
	
	
	@FXML
	private void handleButtonAccount(ActionEvent event) {
		System.out.println("You have Clicked Account");
		LoaderMenuController object = new LoaderMenuController();
		Pane view = object.getPage("UserAccount");
		main_pane.setCenter(view);
	}
	
	
	
	
	public void handleButtonLogout(ActionEvent event) throws IOException {
		 System.out.println("You have Clicked Logout");
			Parent root = FXMLLoader.load(getClass().getResource("/com/naulum/fxgui/controllers/Login.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
	}
	 
	 
	 
	 
	 
	 
	 
	 
	
	//NavMenu Employee
	@FXML
	private void handleButtonAddeBike(ActionEvent event) {
		System.out.println("You have Clicked Add eBike");
		LoaderMenuController object = new LoaderMenuController();
		Pane view = object.getPage("AddeBike");
		main_pane.setCenter(view);
	}
	
	@FXML
	private void handleButtonRemoveeBike(ActionEvent event) {
		System.out.println("You have Clicked Remove eBike");
		LoaderMenuController object = new LoaderMenuController();
		Pane view = object.getPage("RemoveeBike");
		main_pane.setCenter(view);
	}
	
	@FXML
	private void handleButtonClientSh(ActionEvent event) {
		System.out.println("You have Clicked ClientSh");
		LoaderMenuController object = new LoaderMenuController();
		Pane view = object.getPage("ClientScooterHistory");
		main_pane.setCenter(view);
	}
	
	@FXML
	private void handleButtonClientAnagInformation(ActionEvent event) {
		System.out.println("You have Clicked ClientAnagInformation");
		LoaderMenuController object = new LoaderMenuController();
		Pane view = object.getPage("ClientAnagInformation");
		main_pane.setCenter(view);
	}
	
	@FXML
	private void handleButtonMyAccount(ActionEvent event) {
		System.out.println("You have Clicked MyAccount");
		LoaderMenuController object = new LoaderMenuController();
		Pane view = object.getPage("EmpAccount");
		main_pane.setCenter(view);
	}
	
	
	
	
	
	
	
	
	
	//Controllare se ? il modo giusto - Button Inside NavMenu
	 public void ButtonAddCredit(ActionEvent event) throws IOException {
		 	System.out.println("You have Clicked AddCredit");
			Parent root = FXMLLoader.load(getClass().getResource("/com/naulum/fxgui/controllers/AddCredit.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
	}
	
	 public void ButtonAddCard(ActionEvent event) throws IOException {
		 	System.out.println("You have Clicked AddCard");
			Parent root = FXMLLoader.load(getClass().getResource("/com/naulum/fxgui/controllers/AddCard.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
	}
	 
	 public void ButtonCardInfo(ActionEvent event) throws IOException {
		 	System.out.println("You have Clicked CardInfo");
			Parent root = FXMLLoader.load(getClass().getResource("/com/naulum/fxgui/controllers/CardInfo.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
	}
	 
	 
	 
	 
	 
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {	
	}
}
