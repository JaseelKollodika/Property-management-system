package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class HomePageController {

	
    @FXML
    private Button nextPageButton;	
    
    public void nextPageButtonListener(ActionEvent e) throws IOException {
    	Parent parent = FXMLLoader.load(
	               getClass().getResource("NextPage.fxml")); 
	      
	      // Build the scene graph.
	      Scene scene = new Scene(parent); 
	
	      Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
	      // Display our window, using the scene graph.
	      stage.setTitle("MENU"); 
	      stage.setScene(scene);
	      stage.show(); 
    }
    
    
    
    
}
