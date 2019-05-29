package prob4;

public class Condo extends Property
{
    Integer numOfFloors;
    
    public Condo(Address address, Integer numOfFloors)
    {
        super(address);
        this.numOfFloors = numOfFloors;
    }
  
    @Override
    public Double computeRent()
    {
        return Double.valueOf(400 * numOfFloors);
    }
    
    @Override
    public String toString() {
        return String.format("Type: Condo, City: %s, Rent: %s", getCity(), computeRent());
    }

}
