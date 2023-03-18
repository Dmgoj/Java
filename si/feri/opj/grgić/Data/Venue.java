// Adds Venue class the package si.feri.opj.grgić.Data
package si.feri.opj.grgić.Data;

/**
 * The Venue class represents a venue.
 *
 * @author Domagoj Grgić
 */
public class Venue
{
    // Set attributes
    private String name;
    private String phoneNumber;

    /**
     * Creates a new Venue object.
     */
    public Venue()
    {

    }
    /**
     * Creates a new Venue object with the given name.
     * 
     * @param name - the name of the venue
     */
    public Venue(String name)
    {
        this.name = name;
    }
    
    /**
     * Constructs a new Venue object with the given name and phone number.
     * 
     * @param name - the name of the venue
     * @param phoneNumber - phone number
     */
    public Venue(String name, String phoneNumber)
    {
    	this(name);
    	this.phoneNumber = phoneNumber;
    }


}