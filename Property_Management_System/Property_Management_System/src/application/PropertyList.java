package application;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
//this holds list of properties

public class PropertyList  implements Serializable{
	     
	private static final long serialVersionUID = 1L;
	
	private List<property> propertyList;
	
	public PropertyList() {
		propertyList = new ArrayList<>();
	}

	public List<property> getPropertys() {
		return propertyList;
	}
	
	public void addProperty(property b) {
		propertyList.add(b);
	}
}
