// Imports java.time package
import java.time.*;
import java.util.*;

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
        //Athlete athlete = new Athlete[10];
        Athlete athlete = new Athlete("Luka", "Doncic");
        athlete.setAthleteNumber(77);
        athlete.setDateOfBirth(1999,2,28);
        System.out.println(athlete.getName() + athlete.getSurname() +" is born on " + athlete.getDateOfBirth() + " and wears number " + athlete.getAthleteNumber());
       
        Athlete athlete1 = new Athlete("ivan ", "grgic");
        Athlete athlete2 = new Athlete("pero ", "zderic");
        Athlete athlete3 = new Athlete("roki", "balboa");
        Athlete athlete4 = new Athlete("stojane", "dnevnik");
        Athlete athlete5 = new Athlete("uros", "ursus");
        Athlete athlete6 = new Athlete("vakula", "vremenko");
        Athlete athlete7 = new Athlete("zoki", "milanovic");
        Athlete athlete8 = new Athlete("akrap", "lepi");
        Athlete athlete9 = new Athlete("janez", "jansa");
        //Athlete[] athletes ={athlete,athlete1};
        
        // Creates a new Training object
        Training training = new Training("Basketball");
        training.setSchedule(30,3,30,10,30);
        training.setTrainerName("Championmaker");


        // Creates a new Schedule object
        Schedule schedule = new Schedule(2023,3,25,10,00);

        // Call canCompete method
        System.out.println(match.canCompete(athlete));
        System.out.println (match.canCompete(athlete) ? athlete.getName() + " " + athlete.getSurname() + " can compete." : athlete.getName() + " " + athlete.getSurname() + " can not compete!");

        match.addAthleteToMatch(athlete);
        match.addAthleteToMatch(athlete1);
        match.addAthleteToMatch(athlete2);
        match.addAthleteToMatch(athlete3);
        match.addAthleteToMatch(athlete4);
        match.addAthleteToMatch(athlete5);
        match.addAthleteToMatch(athlete6);
        match.addAthleteToMatch(athlete7);
        match.addAthleteToMatch(athlete8);
        match.addAthleteToMatch(athlete9);
        
        match.removeAthleteFromMatch(athlete);

        System.out.println(match.toString());
        
    }
}