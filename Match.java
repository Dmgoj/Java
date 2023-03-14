// Imports java.time package
import java.time.*;
import java.util.*;

// Creates class Match
public class Match
{
    // Declare attributes
    private String name;
    private Schedule schedule;
    private boolean cancelled = false;
    private Athlete[] athletesList = new Athlete[10];
    public int i;

    // Creates default constructor
    public Match()
    {

    }

    // Creates parameterised constructor
    public Match(String name, Schedule schedule)
    {
        this.name = name; 
        this.schedule = schedule;
    }
    
    // name setter
    public void setName(String name)
    {
        this.name = name; 
    }

    // name getter
    public String getName()
    {
        return name;
    }

    // schedule setter
    public void setSchedule (Schedule schedule)
    {
        this.schedule = schedule;
    }

    // schedule getter
    public Schedule getSchedule()
    {
        return schedule;
    }

    // cancelled setter
    public void setCancelled(boolean cancelled)
    {
        this.cancelled = cancelled;
    }

    // cancelled getter
    public boolean getCancelled()
    {
        return cancelled;
    }

    // Checks if athlete can compete based on dateOfBirth
    public boolean canCompete(Athlete athlete)
    {
        int age = Period.between(athlete.getDateOfBirth(), LocalDate.now()).getYears();
        return (age >= 14 && age <= 18);
    }

    // Adds an athlete to the match (from athletesList array)
    public void addAthleteToMatch(Athlete athlete)
    {
       //String athleteName = athlete.getName() + " " + athlete.getSurname();
        for (i=0; i<athletesList.length; i++) {
            if (athletesList[i] == null) {athletesList[i] = athlete; 
            break; }
        } 
        System.out.println(Arrays.toString(this.athletesList));

    }

    // Removes an athlete from the match (from athletesList array)
    public void removeAthleteFromMatch(Athlete athlete)
    {
        //String athleteName = athlete.getName() + " " + athlete.getSurname();
        for (i=0; i<athletesList.length; i++) {
            if(athletesList[i].equals(athlete)) {athletesList[i] = null;}
        }
        System.out.println(Arrays.toString(athletesList));
    }

    // Removes an athlete from the match by athleteNumber
 /*    public boolean removeAthleteFromMatch(int athleteNumber)
    {
        int athleteNumber = athlete.getAthleteNumber();
        for (i=0; i<athletesList.length; i++) {
            if(athletesList[i].equals(athleteName)) {athletesList[i] = null;}
        }
        System.out.println(Arrays.toString(athletesList));
    }

    // Checks if an athlete with a specific last name has been added to the match
    public boolean athleteExists(String lastName)
    {

    } */

    // Outputs all attributes as a string
    @Override
    public String toString()
    {
        return "Name of the match is " + name + " is scheduled on " + schedule +
        ". Is it cancelled = " + cancelled + " Athletes are: " + Arrays.toString(athletesList);
    }
    
    

}