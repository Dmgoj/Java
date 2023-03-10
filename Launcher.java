// Imports java.time package
import java.time.*;

// Creates class Launcher
public class Launcher
{
    // main method starts here
    public static void main(String[] args)
    {
        // Create a new Match object using default constructor
        Match match = new Match();
        match.setName("Football");
        match.setSchedule(2023,3,30,10,00);
        System.out.println(match.getName()+ " match happens on " + match.getSchedule() + " if it is not cancelled! ");

        
        // Creates a new Athlete object
        Athlete athlete = new Athlete("Luka", "Dončić");
        athlete.setAthleteNumber(77);
        athlete.setDateOfBirth(1999,2,28);
        System.out.println(athlete.getName() + athlete.getSurname() +" is born on " + athlete.getDateOfBirth() + " and wears number " + athlete.getAthleteNumber());
        
        // Creates a new Training object
        Training training = new Training("Basketball");
        training.setSchedule(30,3,30,10,30);
        training.setTrainerName("Championmaker");


        // Creates a new Schedule object
        Schedule schedule = new Schedule(2023,3,25,10,00);

        // Call canCompete method
        System.out.println(match.canCompete(athlete));
        System.out.println (match.canCompete(athlete) ? "Athlete can compete." :"Athlete can not compete!");

        

    }
}