package prob4;

public abstract class Property
{
    
    private Address address;
    
    Property(Address address) {
        this.address = address;
    }
    
    abstract public Double computeRent();
    
    public String getCity() {
        return address.getCity();
    }
    
}
