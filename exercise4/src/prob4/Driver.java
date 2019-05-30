package prob4;

public class Driver {

	public static void main(String[] args) {
	    String city1 = "City-1";
	    String city2 = "City-2";
	    Address houseAddress = new Address("Street1", city1, "State-1", 1234);
        Address condoAddress = new Address("Street2", city2, "State-2", 1234);
        Address trailerAddress = new Address("Street3", city1, "State-1", 1234);
	    
		Property[] properties = { new House(houseAddress, 9000), new Condo(condoAddress, 2), new Trailer(trailerAddress) };
		double totalRent = Admin.computeTotalRent(properties);
		System.out.println("Total rent for all property is: " + totalRent);
		System.out.print("Properties with city 1 : " + Admin.getCityProperties(properties, city1));
	}
}
