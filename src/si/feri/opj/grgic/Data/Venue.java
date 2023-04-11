// Adds Venue class the package si.feri.opj.grgić.Data
package si.feri.opj.grgic.Data;

import java.util.*;
/**
 * The Venue class represents a venue.
 *
 * @author Domagoj Grgic
 */
public abstract class Venue
{
    // Set attributes
    protected String name;
    private String phoneNumber;
    protected Match[] listOfMatches;
    private int numberOfMatches;
    private Discipline discipline; 
    

    /**
     * Creates a new Venue object.
     */
    private Venue()
    {

    }
    /**
     * Creates a new Venue object with the given name.
     * 
     * @param name - the name of the venue
     */
    private Venue(String name)
    {
        this.name = name;
    }
    
    /**
     * Constructs a new Venue object with the given name and phone number.
     * 
     * @param name - the name of the venue
     * @param phoneNumber - phone number
     */
    private Venue(String name, String phoneNumber)
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
     * @throws Exception 
     */
    public void addMatch(Match match)throws LateMatchException 
    {
    	if(this instanceof Stadium && match.getSchedule().getDateTime().getHour()>20) { 
    			throw new LateMatchException("Cannot add match after 8 PM.");
    		}
    	
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
    	return (double)numberOfMatches/getCapacity()*100;
    }
    
    public abstract int getCapacity();
	@Override
	public String toString() {
		return "Venue [name=" + name + ", phoneNumber=" + phoneNumber + ", listOfMatches="
				+ Arrays.toString(listOfMatches) + ", numberOfMatches=" + numberOfMatches + "]";
	}
    
   


}