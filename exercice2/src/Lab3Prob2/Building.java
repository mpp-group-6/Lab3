package Lab3Prob2;
import java.util.*;

/**
 * 
 */
public class Building{

    /**
     * Default constructor
     */
    public Building(String id,Double maintenanceCost,List<Apartment> apartments) {
    	this.id = id;
    	this.maintenanceCost = maintenanceCost;
    	this.apartments = apartments;
    }

    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private Double maintenanceCost;
    
    /**
     * 
     */
    public List<Apartment> apartments;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getMaintenanceCost() {
		return maintenanceCost;
	}

	public void setMaintenanceCost(Double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	public List<Apartment> getApartments() {
		return apartments;
	}

	public void setApartments(List<Apartment> apartments) {
		this.apartments = apartments;
	}
	
	public static Apartment createApartment(String id, Double rentFees) {
		return new Apartment(id, rentFees);
	}

    

}