package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RegistrationFormController {
	 @FXML
	    private TextField Emailfield;

	    @FXML
	    private TextField NameField;

	    @FXML
	    private Label address;

	    @FXML
	    private Button backtohome;

	    @FXML
	    private Label name;

	    @FXML
	    private TextField phfield;

	    @FXML
	    private Label phone;

	    @FXML
	    private AnchorPane regi;

	    @FXML
	    private Button submit1;
	    
	    @FXML
	    private Label success;
	    
	    
	    
	    private Customer customer;
	    private CustomerList list;

	    public void initialize() throws ClassNotFoundException, IOException {
	    customer = new Customer();
	    list = new CustomerList();
	    list = DeserialiseCustomerList.readCustomerList("CustomerList.dat");
	    System.out.println("Initialise");
	    submit1.setVisible(true);
	    
	    }
	    public void submitButtonListener() throws IOException, ClassNotFoundException {
	    customer.setName(NameField.getText());
	    customer.setEmail(Emailfield.getText());
	    customer.setPhone(phfield.getText());
	    
	    list.addCustomer(customer);	
	    
	    SerialiseCustomerList.writeToFile(list, "CustomerList.dat");
	    submit1.setVisible(false);// This is to avoid duplicates.    
	    success.setText("Registeration Successfull");
	    
	    }
	    
public void nextPageButtonListener(ActionEvent e) throws IOException {
	Parent parent = FXMLLoader.load(
               getClass().getResource("NextPage.fxml")); 
      
      // Build the scene graph.
      Scene scene = new Scene(parent); 

      Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
      // Display our window, using the scene graph.
      stage.setTitle("Next Page"); // NAME OF PAGE/HEADING
      stage.setScene(scene);
      stage.show(); 
}
}
