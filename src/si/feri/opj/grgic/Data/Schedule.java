// Adds Schedule class to the package si.feri.opj.grgić.Data
package si.feri.opj.grgic.Data;

// Imports java.time package
import java.time.*;
import java.time.format.*;


/**
 * The Schedule class represents a schedule for match or training.
 * It provides methods to set and get the dates of the events above.
 *
 * @author Domagoj Grgić
 */
public class Schedule
{
    // Creates attribute dateTime
    private LocalDateTime dateTime;

    /**
     * Creates a new Schedule object
     */
    public Schedule()
    {

    }
    
    /**
     * Creates a new Schedule object with the specified date and time.
     *
     * @param dateTime - the date and time of the event in LocalDateTime format
     */
    public Schedule(LocalDateTime dateTime)
    {
    	this.dateTime = dateTime;
    }

   
     /**
     * Sets the date and time of the event.
     *
     * @param dateTime - the date and time of the event in LocalDateTime format
     */
    public void setDateTime (LocalDateTime DateTime)
    {
        this.dateTime = DateTime;
    }

     /**
     * Returns the date and time of the event in LocalDateTime format.
     *
     * @return the date and time of the event in LocalDateTime format
     */
    public LocalDateTime getDateTime()
    {
        return dateTime;
    }
    
     /**
     * Overrides toString method
     *
     * @return a string representation of the event's date and time in the format "dd MM yyyy"
     */
    @Override
    public String toString()
    {
    	return dateTime.format(DateTimeFormatter.ofPattern("dd MM yyyy HH mm")) + " ";
    }
}