package prob4;

import java.util.List;

public class Landlord
{
    private String name;
    
    private List<Property> properties;
    
    
    public Landlord(String name, List<Property> properties) {
        this.name = name;
        this.properties = properties;
    }


    public List<Property> getProperties()
    {
        return properties;
    }

}
