package prob4;

public class Address
{
    private String street;
    
    private String city;
    
    private String state;
    
    private Integer zip;
    
    public Address(String street, String city, String state, Integer zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    public String getCity() {
        return city;
    }

}
