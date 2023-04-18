package si.feri.opj.grgic.Data;

public class Hall extends Venue {
	
	private int numberOfAdditionalHalls;
	

	
	
	public Hall(String name, String phoneNumber, int capacity, int halls) {
		super(name, phoneNumber, capacity);
		this.numberOfAdditionalHalls=halls;
	}

	

	public void setNumberOfAdditionalHalls(int numberOfAdditionalHalls)
	{
		if (numberOfAdditionalHalls < 1) { throw new IllegalArgumentException(); } 
		this.numberOfAdditionalHalls = numberOfAdditionalHalls;
	}
	
	

	@Override
	public int getCapacity() {
		return super.listOfMatches.length + numberOfAdditionalHalls;
	}

	@Override
	public String toString() {
		return super.toString() + " " +numberOfAdditionalHalls;
	}
	
	
	
}
