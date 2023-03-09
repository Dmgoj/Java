// Imports java.time package
import java.time.*;

// Creates class Launcher
public class Launcher
{
    // main method starts here
    public static void main(String[] args)
    {
        // Creates a new Match object
        Match match = new Match("Football", 2023, 3, 7, 15, 00);
        match.setName("Baseball");
        System.out.println(match.getName()+ " match happens on " + match.getSchedule() + " if it is not cancelled! ");
        match.setSchedule(2023,3,30,12,00);
        System.out.println("Time of "+ match.getName() + " match is " + match.getSchedule());

        

    }
}