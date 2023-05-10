package si.feri.opj.grgic.Data;

public class Hall extends Venue {
	
	private int numberOfAdditionalHalls;
	

	
	
	public Hall(String name, String phoneNumber, int capacity) {
		super(name, phoneNumber, capacity);
		//this.numberOfAdditionalHalls=halls;
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
		
		String addHallsNumber = (numberOfAdditionalHalls == 0) ? " " : Integer.toString(numberOfAdditionalHalls);
		return super.toString() + " " + addHallsNumber;
	}
	
	
	
}
