package application;

	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/fxml/loginMain.fxml"));
			Scene scene = new Scene(root);
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//this because with the other method it's recommended.
			
			String css = this.getClass().getResource("/css/mainStyle.css").toExternalForm();
			scene.getStylesheets().add(css);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
