package application;

import java.io.IOException;
import java.time.LocalDate;

import javafx.beans.property.Property;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class InvoiceController {
	

    @FXML
    private Label custDetails;

    @FXML
    private Button home;

    @FXML
    private TextField inputCust;

    @FXML
    private TextField inputprop;

    @FXML
    private Label propDetails;

    @FXML
    private Button submit;
	
    @FXML
    private Label invoice;
    
    @FXML
    private DatePicker from;
    
    @FXML
    private DatePicker to;
    
    
	private Customer customer;
    private CustomerList CustomerDetails;
	private property property;
    private PropertyList PropertyDetails;
	
    
    
	public void initialize() throws ClassNotFoundException, IOException {//reading list of property values from serialized file
		customer = new Customer();
		CustomerDetails = new CustomerList();
	    CustomerDetails = DeserialiseCustomerList.readCustomerList("CustomerList.dat");
		property = new property();
		PropertyDetails = new PropertyList();
		PropertyDetails = DeserialiseCustomerList.readPropertyList("PropertyList.dat");
		System.out.println("initialize");
		String customerValue = "";
		
		for(Customer j : CustomerDetails.getCustomers()) {
//    		System.out.print(j.getName());
    		customerValue = customerValue + j.getName()+"\n";
//    		System.out.println(j.getName());
    	}
		System.out.print(customerValue);
		custDetails.setText(customerValue);
		
		String propertyValue = "";
		for(property i : PropertyDetails.getPropertys()) {
			String test = "";
			if(i.getTodate() != null) {
				test = i.getTodate();
			}
//			System.out.print(j.getName());
			propertyValue = propertyValue + i.getID()+"\t"+i.getListed()+"\t"+i.getBedrooms()+"\t"+i.getBathrooms()+"\t"+i.getRent()+"\t\t"+test+ "\n";
//			System.out.println( i.getID());
//			System.out.println(i.getListed());
		}
		
		 
		custDetails.setText(customerValue);/*this sets customer details and property details*/
		propDetails.setText(propertyValue);
	}
	
	
	public void submitButtonListener() throws IOException, ClassNotFoundException {
		customer = new Customer();
		Customer invoiceCust = null;
		CustomerDetails = new CustomerList();
	    CustomerDetails = DeserialiseCustomerList.readCustomerList("CustomerList.dat");
		property = new property();
		property invoiceProp = null;
		PropertyDetails = new PropertyList();
		PropertyDetails = DeserialiseCustomerList.readPropertyList("PropertyList.dat");
		
		String custName = inputCust.getText();//invoice details
		String propID = inputprop.getText();
		LocalDate fromdate = from.getValue();
		LocalDate todate = to.getValue();
		
		for(Customer j : CustomerDetails.getCustomers()) {
			System.out.print(j.getName());
			System.out.print(j.getName());
			
			if (j.getName().equals(custName)) {
				invoiceCust = j;
			}	
    	}
		SerialiseCustomerList li = new SerialiseCustomerList();
		for(property i : PropertyDetails.getPropertys()) { //matching with entered property id of user 
			if (i.getID().equals(propID)) {
				invoiceProp = i;
				i.setFromdate(fromdate.toString());
				i.setTodate(todate.toString());
				PropertyDetails.getPropertys().get(0).setstatus(true);  
				System.out.println(i.getTodate());
				System.out.println("data recieved");
				
			}
		}
		/*after the modification, all data will be stored to prop.dat*/
		SerialiseCustomerList.writeToFile(PropertyDetails, "PropertyList.dat"); 
		
		  
		   
		custDetails.setVisible(false);// This is to avoid duplicates.    
		inputCust.setVisible(false);// This is to avoid duplicates.    
		inputprop.setVisible(false);// This is to avoid duplicates.    
		propDetails.setVisible(false);// This is to avoid duplicates.    
		submit.setVisible(false);// This is to avoid duplicates.    
		
		int rent = Integer.parseInt(invoiceProp.getRent());
		int deposit = 6 * Integer.parseInt(invoiceProp.getRent());
		double agent_fee = rent * 0.2;
		double total = deposit + agent_fee;
		String invoiceDetails = " \t\t                     INVOICE \n\n"+
								"\tName : "+ invoiceCust.getName()+"\n"+
								"\tPhone : " + invoiceCust.getPhone()+"\n"+
								"\tRent : "+  invoiceProp.getRent()+"\n"+
								"\tDeposit : " + deposit+"\n"+
								"\tAgent fee : " + agent_fee+"\n"+
								"\tTotal Amount : " + total;
								
								;
		invoice.setText(invoiceDetails); //after invoice is created, it'll APPEND to a label.
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
