package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javafx.beans.property.Property;

class PropertyTest {
	
	Property prop;

	@BeforeEach
	void setUp() throws Exception {
		
     //prop = new Property();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		prop=null;
	}

	@Test
	void test() {
		assertEquals("jaseel", prop.getName());
	}

}
