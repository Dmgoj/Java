// Imports java.time package
import java.time.*;

// Creates class Match
public class Match
{
    // Declare attributes
    private String name;
    private LocalDateTime schedule;
    private boolean cancelled = false;

    // Creates constructor
    public Match(String name, int year, int month, int dayOfMonth, int hour, int minute)
    {
        this.name = name; 
        this.schedule = LocalDateTime.of(year, month, dayOfMonth, hour, minute);
        this.cancelled = cancelled;
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


}