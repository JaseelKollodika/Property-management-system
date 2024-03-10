package application;

import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class HomePage extends Application {

	public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override	
	public void start(Stage stage) throws Exception {
		  // Load the FXML file.
	      Parent parent = FXMLLoader.load(
	               getClass().getResource("HomePage.fxml")); // it should be the name of FXML file
	      
	      // Build the scene graph.
	      Scene scene = new Scene(parent); 
	      
	      // Display our window, using the scene graph.
	      stage.setTitle("Home Page"); 
	      stage.setScene(scene);
	      stage.show(); 
		
	}
}
