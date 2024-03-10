package application;
import java.io.Serializable;
public class property implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	//private static final long serialVersion;
	//Properties 
	private String ID;

	private String Listed;
	private String Bedrooms;
	private String Bathrooms;
	private String Rent;
	private String Size;
	private String Postcode;
	private String Latitud_Longitude;
	private String Furnishing;
	private String Type;
	private String Garden;
	private String todate="";
	private String fromdate="";
	private boolean propertyStatus=false;// Initially added all property status to false
	
	static private int counter = 0;
	

	public void Property() {
		//ID = String.valueOf(counter++);
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}

	public boolean getstatus() {
		return propertyStatus;
	}
	public void setstatus(boolean propertyStatus) {
		propertyStatus = propertyStatus;
	}
	public String getListed() {
        return Listed;
    }
	public void setListed(String Listed) {
        this.Listed = Listed;
    }
	public String getBedrooms() {
        return Bedrooms;
    }
	
	public void setBedrooms(String Bedrooms) {
        this.Bedrooms = Bedrooms;
    }
	public String getBathrooms() {	
        return Bathrooms;
    }
	public void setBathrooms(String Bathrooms) {
        this.Bathrooms = Bathrooms;
    }
	public String getRent() {
        return Rent;
    }
	public void setRent(String Rent) {
        this.Rent = Rent;
    }
	public String getSize() {
        return Size;
    }
	public void setSize(String Size) {
        this.Size = Size;
    }
	public String getPostcode() {
        return Postcode;
    }
	public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }
	public String getLatitud_Longitude() {
        return Latitud_Longitude;
    }
	public void setLatitud_Longitude(String Latitud_Longitude) {
        this.Latitud_Longitude = Latitud_Longitude;
    }
	public String getFurnishing() {
        return Furnishing;
    }
	public void setFurnishing(String Furnishing) {
        this.Furnishing = Furnishing;
    }
	public String getType() {
        return Type;
    }
	public void setType(String Type) {
        this.Type = Type;
    }
	public String getGarden() {
        return Garden;
    }
	public void setGarden(String Garden) {
        this.Garden = Garden;
    }

	public String getTodate() {
		return todate;
	}

	public void setTodate(String todate) {
		this.todate = todate;
	}

	public String getFromdate() {
		return fromdate;
	}

	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}
	
}