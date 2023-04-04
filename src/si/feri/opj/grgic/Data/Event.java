package si.feri.opj.grgic.Data;
/**
 * 
 * @author domagoj.grgic
 *
 */
public class Event {
	protected String name;
    protected Schedule schedule;
    protected boolean cancelled = false;
    
    public Event() {}
    
    /**
     * Constructor sets name, schedule and if Event is cancelled
     * @param name
     * @param schedule
     * @param cancelled
     */
    public Event(String name,Schedule schedule, boolean cancelled)
    {
    	this.name = name;
    	this.schedule = schedule;
    	this.cancelled = cancelled;
    }
    
    /**
     * 
     * @param name
     */
    public void setName(String name)
    {
        this.name = name; 
    }
    
    /**
     * 
     * @return name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * 
     * @param schedule
     */
    public void setSchedule (Schedule schedule)
    {
        this.schedule = schedule;
    }
    
    /**
     * 
     * @return schedule
     */
    public Schedule getSchedule()
    {
        return schedule;
    }
    
    @Override
    public String toString()
    {
    	return name + schedule + cancelled;
    }

}
