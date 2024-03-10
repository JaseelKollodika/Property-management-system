	package application;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/*
 * Created a serialized object file and writing list
 */
public class SerialiseCustomerList {

	public static void writeToFile(CustomerList list, String filename) throws IOException {
		 // Create the stream objects.
		try {
	      FileOutputStream outStream = 
	                new FileOutputStream(filename);
	      ObjectOutputStream objectOutputFile = 
	                new ObjectOutputStream(outStream);
	      
	      // Write the serialized object to the file.

	        objectOutputFile.writeObject(list);
	      
	      // Close the file.
	      objectOutputFile.close();
	      
		} catch (IOException i) {
			i.printStackTrace();
		}
 
	      System.out.println("The serialized objects " +
	            "were written to "+filename);
		
	}
	
	public static void writeToFile(PropertyList list, String filename) throws IOException {
		 // Create the stream objects.
		try {
	      FileOutputStream outStream = 
	                new FileOutputStream(filename);
	      ObjectOutputStream objectOutputFile = 
	                new ObjectOutputStream(outStream);
	      
	      // Write the serialized object to the file.

	        objectOutputFile.writeObject(list);
	      
	      // Close the file.
	      objectOutputFile.close();
	      
		} catch (IOException i) {
			i.printStackTrace();
		}

	      System.out.println("The serialized objects " +
	            "were written to "+filename);
		
	}

}
