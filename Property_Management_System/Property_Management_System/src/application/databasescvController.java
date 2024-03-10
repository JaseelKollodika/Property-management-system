package application;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.beans.property.Property;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class databasescvController {
	@FXML
    private Label list;
	@FXML
    private Button nextPageButton;
	
	private property property;
    private PropertyList listproperty;
    
    
	public void initialize() throws ClassNotFoundException, IOException {
		
		listproperty = new PropertyList();
		listproperty = DeserialiseCustomerList.readPropertyList("PropertyList.dat");
	    
        String filename = "House_Rent_Dataset.csv"; // set the filename
        File file = new File(filename); // open the file with the specified name

        if (!file.exists()) { //check if the file exists 
            System.out.println("File " + filename + " not found.");
            return;
        }

        Scanner inputFile = new Scanner(file); // create a scanner to read the file
        ArrayList<String[]> data = new ArrayList<>(); // Create an ArrayList to store the data
        while (inputFile.hasNext()) {
            String line = inputFile.nextLine();
            data.add(line.split(",")); // add each line as an array of string in the ArrayList
        }
        inputFile.close();
        
        String values = "";
        String value = "";
        // print the table
        String[] val = null;
        int i = 0;
        System.out.println("Table:");
        for (String[] row : data) {
        	
//        	System.out.println(row[0]);
            for (String cell : row) {
            	values = values + cell + "\t";
            	value = cell;
//                System.out.print(cell + "\t");
            	
            	
                System.out.println();
                System.out.println(row[0]);
                System.out.println(row[1]);
                System.out.println(row[2]);
                System.out.println(row[3]);
                System.out.println(row[4]);
                System.out.println(row[5]);
                System.out.println(row[6]+" "+row[7]);
                System.out.println(row[8]);
                System.out.println(row[9]);
                System.out.println(row[10]);
                
                
//                property.setID(row[0]);
//                property.setListed(row[1]);
//                property.setBedrooms(row[2]);
//                property.setBathrooms(row[3]);
//                property.setRent(row[4]);
//                property.setSize(row[5]);
//                property.setPostcode(row[6]);
//                property.setLatitud_Longitude(row[7]+" "+row[8]);
//                property.setFurnishing(row[9]);
//                property.setType(row[10]);
//                property.setGarden(row[11]);
                
//                listproperty.addProperty(property);
            }
            values = values + "\n";
           // property.setID(String.valueOf(i));
           // property.
//            System.out.println();
//            System.out.println(row[0]);
//            System.out.println(row[1]);
//            System.out.println(row[2]);
//            System.out.println(row[3]);
//            System.out.println(row[4]);
//            System.out.println(row[5]);
//            System.out.println(row[6]+" "+row[7]);
//            System.out.println(row[8]);
//            System.out.println(row[9]);
//            System.out.println(row[10]);
            property = new property();
            property.setID(row[0]);
            property.setListed(row[1]);
            property.setBedrooms(row[2]);	
            property.setBathrooms(row[3]);
            property.setRent(row[4]);
            property.setSize(row[5]);
            property.setPostcode(row[6]);
            property.setLatitud_Longitude(row[7]+" "+row[8]);
            property.setFurnishing(row[9]);
            property.setType(row[10]);
            property.setGarden(row[11]);
            property.setstatus(false);// setting the status of all property false initially.
            listproperty.addProperty(property);
            
      }
//        System.out.println(values);
        int count = listproperty.getPropertys().size();
        if(count < 51)
        	SerialiseCustomerList.writeToFile(listproperty, "PropertyList.dat");
        
        list.setText(values);
    }
	
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
}

    
  
