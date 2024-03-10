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


public class NextPageController {


    @FXML
    private Button backtohome;
    @FXML
    private Button register;
    @FXML
    private Button Prop;
    
    	
  
    public void nextPageButtonListener(ActionEvent e) throws IOException {
    	Parent parent = FXMLLoader.load(
	               getClass().getResource("HomePage.fxml")); 
	      
	      // Build the scene graph.
	      Scene scene = new Scene(parent); 
	
	      Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
	      // Display our window, using the scene graph.
	      stage.setTitle("Home Page"); 
	      stage.setScene(scene);
	      stage.show(); 
    }
    public void registrationButton1(ActionEvent e) throws IOException {
    	Parent parent = FXMLLoader.load(
	               getClass().getResource("Registrationform.fxml")); 
	        
	      // Build the scene graph.
	      Scene scene = new Scene(parent); 
	
	      Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
	      // Display our window, using the scene graph.
	      stage.setTitle("Registration form Page"); 
	      stage.setScene(scene);
	      stage.show(); 
    }
    public void propertyButton(ActionEvent e) throws IOException {
    	
    	Parent parent = FXMLLoader.load(
	            getClass().getResource("Dataset.fxml")); 
	      
	      // Build the scene graph.
	      Scene scene = new Scene(parent); 
	
	      Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
	      // Display our window, using the scene graph.
	      stage.setTitle("Properties"); 
	      stage.setScene(scene);
	      stage.show();
}
    /*New code invoice*/
    public void invoiceButton(ActionEvent e) throws IOException {
    	Parent parent = FXMLLoader.load(
	               getClass().getResource("Invoice.fxml")); 
	      
	      // Build the scene graph.
	      Scene scene = new Scene(parent); 
	
	      Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
	      // Display our window, using the scene graph.
	      stage.setTitle("Invoice"); 
	      stage.setScene(scene);
	      stage.show(); 
}
    
}