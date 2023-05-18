// Adds Training class the package si.feri.opj.grgić.Data
package si.feri.opj.grgic.Data;

// Imports java.time packages
import java.time.*;

/**
 * The Training class represents a training event that has name, schedule, cancellation status and 
 * which is lead by trainer.
 *
 * @author Domagoj Grgić
 */
public class Training extends Event
{
    // Sets attributes
    /*private String name;
    private Schedule schedule;
    private boolean cancelled = false;*/
    private String trainerName;

    /**
     * Default constructor that creates Training object.
     */
    public Training()
    {

    }

   /**
     * Creates a new Training object with the given name.
     *
     * @param name - the name of the training.
     */
    public Training(String name, Schedule schedule, boolean cancelled)
    {
        super(name, schedule, cancelled);
    }

    /**
     * Sets the name of the training.
     *
     * @param name - the name of the training.
     */
    /*public void setName(String name)
    {
        this.name = name; 
    }*/

     /**
      * Gets the name of the training.
      *
      * @return The name of the training.
      */
    /*public String getName()
    {
        return name;
    }*/

   
     /**
      * Sets the schedule of the training.
      *
      * @param schedule - the schedule of the training.
      */
    /*public void setSchedule (Schedule schedule)
    {
        this.schedule = schedule;
    }*/

    /**
     * Gets the schedule of the training.
     *
     * @return The schedule of the training.
     */
    /*public Schedule getSchedule()
    {
        return schedule;
    }*/

    /**
     * Sets the name of the trainer leading the training.
     * @param trainerName - the name of the trainer.
     */
    public void setTrainerName(String trainerName)
    {
        this.trainerName = trainerName; 
    }

    /**
     * Gets the name of the trainer leading the training.
     *
     * @return The name of the trainer.
     */
    public String getTrainerName()
    {
        return trainerName;
    }

    /**
     
    
    /**
     * Overrides toString method
     *
     * @return string containing name, schedule, trainer name and whether the training has been cancelled.
     */
    @Override
    public String toString()
    {
    	return super.toString() + " ";
    }
    
}