package si.feri.opj.grgić.Data;

public class Hall extends Venue {
	private int capacity;
	private int numberOfAdditionalHalls;
	
	public Hall()
	{
		
	}
	
	public Hall(int capacity)
	{
		this.capacity = capacity;
		super.capacity = capacity;
	}	
	
	public void setNumberOfAdditionalHalls(int numberOfAdditionalHalls)
	{
		this.numberOfAdditionalHalls = numberOfAdditionalHalls;
	}
	
	

	@Override
	public int getCapacity() {
		return capacity+ numberOfAdditionalHalls;
	}

	@Override
	public String toString() {
		return "Hall [capacity=" + capacity + ", numberOfAdditionalHalls=" + numberOfAdditionalHalls + "]";
	}
	
	
	
}
