// Adds Training class package si.feri.opj.grgić.Data
package si.feri.opj.grgić.Data;

// Imports java.time packages
import java.time.*;

// Creates class Training
public class Training
{
    // Sets attributes
    private String name;
    private Schedule schedule;
    private String trainerName;
    private boolean cancelled = false;

    // Creates default constructor
    public Training()
    {

    }

    // Creates parameterised constructor
    public Training(String name)
    {
        this.name = name;
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

    // trainerName setter
    public void setTrainerName(String trainerName)
    {
        this.trainerName = trainerName; 
    }

    // tranierName getter
    public String getTrainerName()
    {
        return trainerName;
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
    
    @Override
    public String toString()
    {
    	return name + schedule + trainerName + cancelled + " ";
    }
    
}