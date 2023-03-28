package si.feri.opj.grgić.Data;

public class Stadium extends Venue {

	private int capacity;
	
	public Stadium()
	{
		
	}
	
	public Stadium(int capacity)
	{
		this.capacity = capacity;
	}
	@Override
	public int getCapacity() {
		return capacity;
	}

	@Override
	public String toString() {
		return "Stadium [capacity=" + capacity + "]";
	}
	
	

}
