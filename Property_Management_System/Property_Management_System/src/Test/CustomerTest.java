package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import application.Customer;

class CustomerTest {
	Customer cust;//given an alias to customer/defined
	@BeforeEach
	void setUp() throws Exception {
		cust = new Customer();//Object created 
		cust.setName("jaseel");
		cust.setEmail("jaseel@gmail.com");
		cust.setPhone("9567313699");
	}

	@AfterEach
	void tearDown() throws Exception {
		cust = null;
	}

	@Test
	void test() {
		 assertEquals("jaseel", cust.getName());
		 assertEquals("jaseel@gmail.com", cust.getEmail());
		 assertEquals("9567313699", cust.getPhone());
	}
	

}
