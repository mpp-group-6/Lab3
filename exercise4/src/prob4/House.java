package prob4;

public class House extends Property
{
    private Integer lotSize;
    
    public House( Address address, Integer lotSize)
    {
        super(address);
        this.lotSize = lotSize;
    }

    @Override
    public Double computeRent()
    {
        return 0.1 * lotSize;
    }
    
    @Override
    public String toString() {
        return String.format("Type: House, City: %s, Rent: %s", getCity(), computeRent());
    }
}
