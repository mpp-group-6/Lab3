package Lab3Prob2;
import java.util.*;

/**
 * 
 */
public class Landlord {

    /**
     * Default constructor
     */
    public Landlord(String id,List<Building> buildings) {
    	this.id = id;
    	this.buildings = buildings;
    }

    /**
     * 
     */
    public String id;


    /**
     * 
     */
    public List<Building> buildings;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public List<Building> getBuildings() {
		return buildings;
	}


	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}
	
	public Double getMonthlyProfit() {
		Double result = 0.0;
		for(Building b : buildings) {
			List<Apartment> apartments = b.getApartments();
			for(Apartment a : apartments) {
				result += a.getRentFees();
			}
			result = result - b.getMaintenanceCost();
		}
		return result;
	}

    
}