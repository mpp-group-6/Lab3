package prob4;

public class Trailer extends Property
{
    private Double trailerFlatRentCharge = 500.0;       //$500 flat cost 
    
    public Trailer(Address parkAddress) {
        super(parkAddress);
    }

    @Override
    public Double computeRent()
    {
        return trailerFlatRentCharge;
    }
    
    @Override
    public String toString() {
        return String.format("Type: Trailer, City: %s, Rent: %s", getCity(), computeRent());
    }

}
