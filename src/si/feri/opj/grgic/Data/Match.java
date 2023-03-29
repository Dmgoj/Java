// Adds Match class to the package si.feri.opj.grgić.Data
package si.feri.opj.grgic.Data;

// Imports java.time and util package
import java.time.*;
import java.util.*;

/**
 * Match class represents a match with a name, schedule, athletes list and cancellation status.
 * Contain methods to add, remove, and check athletes that can compete in the match.
 * 
 * @author Domagoj Grgić
 */
public class Match extends Event
{
    // Declare attributes
    private String name;
    private Schedule schedule;
    private boolean cancelled = false;
    private Athlete[] athletesList = new Athlete[10];
    public int i;

    /**
     * Default constructor that creates a new Match object
     */
    public Match()
    {

    }

    /**
     * Creates a new Match object with the specified name and schedule.
     * 
     * @param name - the name of the match
     * @param schedule - the schedule of the match
     */
    public Match(String name, Schedule schedule)
    {
        this.name = name; 
        this.schedule = schedule;
    }
    
    /**
     * Sets the name of the match.
     * 
     * @param name - the name of the match
     */
    public void setName(String name)
    {
        this.name = name; 
    }

    /**
     * Gets the name of the match.
     * 
     * @return the name of the match
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the schedule of the match.
     * 
     * @param schedule - the schedule of the match
     */
    public void setSchedule (Schedule schedule)
    {
        this.schedule = schedule;
    }

    /**
     * Gets the schedule of the match.
     * 
     * @return the schedule of the match
     */
    public Schedule getSchedule()
    {
        return schedule;
    }

    /**
     * Sets the cancellation status of the match.
     * 
     * @param cancelled - the cancellation status of the match
     */
    public void setCancelled(boolean cancelled)
    {
        this.cancelled = cancelled;
    }

    /**
     * Gets the cancellation status of the match.
     * 
     * @return the cancellation status of the match
     */
    public boolean getCancelled()
    {
        return cancelled;
    }

    /**
     * Checks if the athlete can compete in the match based on their age.
     * 
     * @param athlete - the athlete to check
     * @return true if the athlete can compete, false otherwise
     */
    public boolean canCompete(Athlete athlete)
    {
        int age = Period.between(athlete.getDateOfBirth(), LocalDate.now()).getYears();
        return (age >= 14 && age <= 18);
    }

    /**
     * Adds the athlete to the match if there is space in the athletes list.
     * 
     * @param athlete - the athlete to add
     */
    public void addAthleteToMatch(Athlete athlete)
    {
        for (i=0; i<athletesList.length; i++) {
            if (athletesList[i] == null) {athletesList[i] = athlete; 
            System.out.println(athletesList[i].getName() + " " + athletesList[i].getSurname() + " is added.");
            break; }
        }
    }

    /**
     * Removes the athlete from the match if they are in the athletes list.
     * 
     * @param athlete - the athlete to remove
     */
    public void removeAthleteFromMatch(Athlete athlete)
    {
        for (i=0; i<athletesList.length; i++) {
            if(athletesList[i] != null && athletesList[i].equals(athlete)) {
                System.out.println(athletesList[i].getName() + " " + athletesList[i].getSurname() + " is removed.");
                athletesList[i] = null;
                break;
            }
        }
        
    }

    /**
     * Removes the athlete from the match by their number, if they are in the athletes list .
     * 
     * @param athleteNumber - the athlete's number whom we want to remove
     * @return true if athlete is removed
     */
    public boolean removeAthleteFromMatch(int athleteNumber)
    {
        
        for (i=0; i<athletesList.length; i++) {
            if(athletesList[i]!=null && athletesList[i].getAthleteNumber() == athleteNumber) {
				athletesList[i] = null;
				return true;
            }
        } 
        return false;
    }

    /**
     * Checks if an athlete with the specified last name is in the match (atheletes list).
     * 
     * @param lastName - the last name of the athlete to check
     * @return true if an athlete with the specified last name has been added, false otherwise
     */
    public boolean athleteExists(String lastName)
    {
    	
    	for (i=0; i<athletesList.length; i++) {
    		if(athletesList[i] != null && athletesList[i].getSurname().equals(lastName)) {return true;}
         } 
    	return false;
         
    }

    /**
     * Overrides toString method
     * 
     * @return a string that contains name, schedule and cancelation status of the match and list of athletes
     */
    @Override
    public String toString()
    {
        return name + " " + schedule + " " + cancelled + " " + Arrays.toString(athletesList) + " ";
    }
    
    

}