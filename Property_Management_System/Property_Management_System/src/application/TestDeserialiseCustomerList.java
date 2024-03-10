package application;
import java.io.IOException;

/*This is to check the file consist of all data*/
public class TestDeserialiseCustomerList {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		DeserialiseCustomerList.readCustomerList("CustomerList.dat");
	}

}