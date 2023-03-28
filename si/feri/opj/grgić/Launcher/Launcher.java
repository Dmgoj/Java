// Adds Launcher class to the si.feri.opj.grgić.Launcher package
package si.feri.opj.grgić.Launcher;

// Imports si.feri.opj.grgić.Data package
import si.feri.opj.grgić.Data.*;

// Imports java.time and util package
import java.time.*;
import java.util.*;

/**
 * Class Launcher contains main method which is responsible for creating new Athlete, Match, Training and Schedule objects,
 * aswell as for calling methods of those objects and printing out results.
 *
 * @author Domagoj Grgić
 */
public class Launcher
{
    /**
     * main method creates new Athlete, Match, Training and Schedule objects,
     * aswell as calling methods of those objects and printing out results.
     * @param args - accepts attributes in command line
     */
    public static void main(String[] args)
    {
        // Creates new Match schedule
        Schedule matchSchedule = new Schedule(LocalDateTime.of(2023,3,30,14,00));
        
        // Create a new Match object using default constructor
        Match match = new Match();
        match.setName("Football");
        match.setSchedule(matchSchedule);

        // Prints all the attributes in the match
        System.out.println("MATCH: " + match);
       
        
        // Creates a new Athlete object
        Athlete athlete = new Athlete("Luka", "Doncic");
        
        // Set the rest of the Athlete object attributes
        athlete.setAthleteNumber(77);
        athlete.setDateOfBirth(1999,2,28);
        
        // Prints all the attributes in athlete
        System.out.println("ATHLETE: " + athlete);
       
        // Creates another Athlete object
        Athlete athlete1 = new Athlete("Robert", "Prosinečki");
        athlete1.setAthleteNumber(8);
        athlete1.setDateOfBirth(1969,1,12);
        /* Athlete athlete2 = new Athlete("pero", "zderic");
        Athlete athlete3 = new Athlete("roki", "balboa");
        Athlete athlete4 = new Athlete("stojane", "dnevnik");
        Athlete athlete5 = new Athlete("uros", "ursus");
        Athlete athlete6 = new Athlete("vakula", "vremenko");
        Athlete athlete7 = new Athlete("zoki", "milanovic");
        Athlete athlete8 = new Athlete("akrap", "lepi");
        Athlete athlete9 = new Athlete("janez", "jansa"); */
        
        
        // Creates a new Training object
        Training training = new Training("Basketball");
        
        // Sets the rest of the Training attributes
        training.setSchedule(new Schedule(LocalDateTime.of(2023, 2, 2, 10, 00)));
        training.setTrainerName("Championmaker");

        // Prints all of the Training attributes
        System.out.println("TRAINING: " + training);

       
        // Call canCompete method
        System.out.println(match.canCompete(athlete));
        System.out.println (match.canCompete(athlete) ? athlete.getName() + " " + athlete.getSurname() + " can compete." : athlete.getName() + " " + athlete.getSurname() + " can not compete!");

        match.addAthleteToMatch(athlete);
        match.addAthleteToMatch(athlete1);
        /* match.addAthleteToMatch(athlete2);
        match.addAthleteToMatch(athlete3);
        match.addAthleteToMatch(athlete4);
        match.addAthleteToMatch(athlete5);
        match.addAthleteToMatch(athlete6);
        match.addAthleteToMatch(athlete7);
        match.addAthleteToMatch(athlete8);
        match.addAthleteToMatch(athlete9); */
        
        match.removeAthleteFromMatch(athlete1);
        match.removeAthleteFromMatch(77);

        System.out.println(match.athleteExists("Doncic"));
        
       
        
        Match match1 = new Match();
       
        Hall hall = new Hall();
    }
}