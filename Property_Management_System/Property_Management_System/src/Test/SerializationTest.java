package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import application.CustomerList;
import application.DeserialiseCustomerList;
import application.SerialiseCustomerList;

class SerializationTest {
	DeserialiseCustomerList SerialList;
	@BeforeEach
	void setUp() throws Exception {
		SerialList = new DeserialiseCustomerList();
	}

	@AfterEach
	void tearDown() throws Exception {
		SerialList=null;
	}

	@Test
	void test() {
		CustomerList res;
		try {
			res = DeserialiseCustomerList.readCustomerList("CustomerList.dat");
			assertTrue(res.getCustomers().size() > 0);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
