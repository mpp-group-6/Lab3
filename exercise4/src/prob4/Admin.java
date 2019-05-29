package prob4;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property property : properties) {
		    totalRent += property.computeRent();	
		}
		return totalRent;
	}
	
	public static List<Property> getCityProperties(Property[] properties, String city) {
	    List<Property> cityProperties = new ArrayList<Property>();
	    for (Property property : properties) {
            if(property.getCity().equalsIgnoreCase(city))
                cityProperties.add(property);
        }
	    return cityProperties;
	}
}
