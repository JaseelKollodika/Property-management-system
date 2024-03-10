package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
/*
 * Reads a list of customers from a serialized object file
 */


public class DeserialiseCustomerList {

	public static CustomerList readCustomerList(String filename) throws IOException, ClassNotFoundException {
		CustomerList list = new CustomerList();
		try {
			File f = new File(filename);
			FileInputStream inStream;	
			ObjectInputStream objectInputFile = null;
			if (f.exists()) {
				inStream = new FileInputStream(filename);
				objectInputFile = new ObjectInputStream(inStream);
			} else {
				System.out.println("File " + filename + " does not exist");
				return list;
			}

			if (f.length() > 0) {
				// Read the serialized objects from the file.
				list = (CustomerList) objectInputFile.readObject();
				
				System.out.println("read object");

				// Close the file.
				objectInputFile.close();
			} else
				System.out.println("File " + filename + " is empty");
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		}
		
		System.out.println("list size: "+list.getCustomers().size());

		// display list
		if (list.getCustomers().size() > 0) {
			System.out.println("Customer in the list are: ");
			for (int i = 0; i < list.getCustomers().size(); i++) {
				System.out.println("Customer Name: " + list.getCustomers().get(i).getName());

			}
		}

		return list;
	}

	
	public static PropertyList readPropertyList(String filename) throws IOException, ClassNotFoundException {
		PropertyList list = new PropertyList();
		try {
			File f = new File(filename);
			FileInputStream inStream;
			ObjectInputStream objectInputFile = null;
			if (f.exists()) {
				inStream = new FileInputStream(filename);
				objectInputFile = new ObjectInputStream(inStream);
			} else {
				System.out.println("File " + filename + " does not exist");
				return list;
			}

			if (f.length() > 0) {
				// Read the serialized objects from the file.
				list = (PropertyList) objectInputFile.readObject();
				
				System.out.println("read object");

				// Close the file.
				objectInputFile.close();
			} else
				System.out.println("File " + filename + " is empty");
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		}
		
		System.out.println("list size: "+list.getPropertys().size());

		// display list
		if (list.getPropertys().size() > 0) {
			System.out.println("Property in the list are: ");
		//	for (int i = 0; i < list.getPropertys().size(); i++) {
		//		System.out.println("Property Name: " + list.getPropertys().get(i).getName());

			//}
		}

		return list;
	}
}