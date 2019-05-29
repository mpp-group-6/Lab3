package Lab3Prob2;
import java.util.*;

/**
 * 
 */
public class Apartment {

    /**
     * Default constructor
     */
    public Apartment(String id, Double rentFees) {
    	this.id = id;
    	this.rentFees = rentFees;
    }

    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private Double rentFees;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getRentFees() {
		return rentFees;
	}

	public void setRentFees(Double rentFees) {
		this.rentFees = rentFees;
	}
    
    

}