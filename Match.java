// Imports java.time package
import java.time.*;
import java.util.*;

// Creates class Match
public class Match
{
    // Declare attributes
    private String name;
    private LocalDateTime schedule;
    private boolean cancelled = false;
    private String athletesList[] = new String[10];
    public int i;

    // Creates default constructor
    public Match()
    {

    }

    // Creates parameterized constructor
    public Match(String name, int year, int month, int dayOfMonth, int hour, int minute)
    {
        this.name = name; 
        this.schedule = LocalDateTime.of(year, month, dayOfMonth, hour, minute);
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
    public void setSchedule (int year, int month, int dayOfMonth, int hour, int minute)
    {
        this.schedule = LocalDateTime.of(year, month, dayOfMonth, hour, minute);
    }

    // schedule getter
    public LocalDateTime getSchedule()
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

    // Adds an athlete to the match (athletesList array)
    public void addAthleteToMatch(Athlete athlete)
    {
        String athleteName = athlete.getName() + " " + athlete.getSurname();
        for (i=0; i<athletesList.length; i++) {
            if (athletesList[i] == null) {athletesList[i] = athleteName; 
            break; }
        } 
    }

}