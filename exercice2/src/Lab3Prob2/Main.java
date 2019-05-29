package Lab3Prob2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apartment B1A1 = Building.createApartment("100", 120.00); 
		Apartment B1A2 = Building.createApartment("101", 125.00); 
		List<Apartment> listApartmentsB1 = new ArrayList<Apartment>();
		listApartmentsB1.add(B1A1);
		listApartmentsB1.add(B1A2);
		
		Building B1 = new Building("B1", 90.0, listApartmentsB1);
		
		Apartment B2A1 = Building.createApartment("110", 140.00); 
		Apartment B2A2 = Building.createApartment("111", 145.00);
		List<Apartment> listApartmentsB2 = new ArrayList<Apartment>();
		listApartmentsB2.add(B2A1);
		listApartmentsB2.add(B2A2);
		Building B2 = new Building("B2", 100.0, listApartmentsB2);
		
		List<Building> buildings = new ArrayList<Building>();
		buildings.add(B1);
		buildings.add(B2);
		Landlord landlord = new Landlord("Pogo Romuald", buildings);
		
		Double benefit = landlord.getMonthlyProfit();
		
		System.out.println("Landlord "+landlord.getId()+" has monthly profit : "+benefit);
		
	}

}
