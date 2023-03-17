// Adds Venue class package si.feri.opj.grgić.Data
package si.feri.opj.grgić.Data;

// Creates class Venue
public class Venue
{
    // Set attributes
    private String name;
    private String phoneNumber;

    // Creates default constructor
    public Venue()
    {

    }

    // Creates parameterized constructor
    public Venue(String name)
    {
        this.name = name;
    }
    
    public Venue(String name, String phoneNumber)
    {
    	this(name);
    	this.phoneNumber = phoneNumber;
    }


}