// Imports java.time packages
import java.time.*;
//import java.time.format.*;

// Creates class Training
public class Training
{
    // Sets attributes
    private String name;
    private LocalDateTime schedule;
    private String trainerName;
    private boolean cancelled = false;

    // Creates default constructor
    public Training()
    {

    }

    // Creates parameterized constructor
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
    public void setSchedule (int year, int month, int dayOfMonth, int hour, int minute)
    {
        this.schedule = LocalDateTime.of(year, month, dayOfMonth, hour, minute);
    }

    // schedule getter
    public LocalDateTime getSchedule()
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
    
}