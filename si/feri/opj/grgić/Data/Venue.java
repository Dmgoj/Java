// Adds Venue class the package si.feri.opj.grgić.Data
package si.feri.opj.grgić.Data;

import java.util.*;
/**
 * The Venue class represents a venue.
 *
 * @author Domagoj Grgić
 */
public abstract class Venue
{
    // Set attributes
    private String name;
    private String phoneNumber;
    private Match[] listOfMatches;
    private int numberOfMatches;
    
    

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
    
    public Venue(String name, String phoneNumber, int capacity)
    {
    	
    	this(name,phoneNumber);
    	this.listOfMatches = new Match[capacity];
    	
    }
    
   
    /**
     * Adds a match to the venue
     * @param match
     */
    public void addMatch(Match match)
    {
    	if (numberOfMatches<listOfMatches.length) {
    		listOfMatches[numberOfMatches] = match;
    		numberOfMatches++;
    	}
    }
    
    /**
     *  removes all matches from the venue
     */
    public void removeMatches()
    {
    	if (listOfMatches != null)listOfMatches = null;
    }
    
    /**
     * 
     * @return the percentage of venue occupancy with matches
     */
    public double getOccupancy()
    {
    	return numberOfMatches/listOfMatches.length*100;
    }
    
    public abstract int getCapacity();
	@Override
	public String toString() {
		return "Venue [name=" + name + ", phoneNumber=" + phoneNumber + ", listOfMatches="
				+ Arrays.toString(listOfMatches) + ", numberOfMatches=" + numberOfMatches + ", capacity=" + capacity
				+ "]";
	}
    
   


}