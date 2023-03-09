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

        // Creates a new Athlete object
        Athlete athlete = new Athlete("Domagoj", "Grgić", 6, 1988,1,6);
        System.out.println(athlete.getName() + athlete.getSurname() +" is born on " + athlete.getDateOfBirth() + " and wears number " + athlete.getAthleteNumber());
        athlete.setName("Luka");
        athlete.setSurname("Dončić");
        athlete.setAthleteNumber(77); 
        athlete.setDateOfBirth(1999,2,28);
        System.out.println(athlete.getName() + athlete.getSurname() +" is born on " + athlete.getDateOfBirth() + " and wears number " + athlete.getAthleteNumber());

    }
}