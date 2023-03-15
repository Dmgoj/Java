// Imports java.time package
import java.time.*;
import java.time.format.*;


// Creates class Schedule
public class Schedule
{
    // Creates attribute dateTime
    private LocalDateTime dateTime;

    // Creates default constructor
    public Schedule()
    {

    }
    
    // Creates parameterised constructor
    public Schedule(LocalDateTime dateTime)
    {
    	this.dateTime = dateTime;
    }

   
    // schedule setter
    public void setDateTime (LocalDateTime DateTime)
    {
        this.dateTime = DateTime;
    }

    // schedule getter
    public LocalDateTime getDateTime()
    {
        return dateTime;
    }
    
    public String toString()
    {
    	return dateTime.format(DateTimeFormatter.ofPattern("dd MM yyyy")) + " ";
    }

}