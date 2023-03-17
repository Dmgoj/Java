// Adds Athlete class package si.feri.opj.grgić.Data
package si.feri.opj.grgić.Data;

// Imports java.time s
import java.time.*;
//import java.time.format.*;

// Creates class Athlete
public class Athlete
{
    // Sets attributes
    private String name;
    private String surname;
    private int athleteNumber;
    private LocalDate dateOfBirth;

    // Creates default constructor
    public Athlete()
    {

    }

    // Creates parameterised constructor
    public Athlete(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }
    
    public Athlete(String name, String surname, int athleteNumber, LocalDate dateOfBirth)
    {
    	this(name,surname);
    	this.athleteNumber = athleteNumber;
    	this.dateOfBirth = dateOfBirth;
    }
    
    // name setter
    public void setName(String name)
    {
        this.name = name;
    }

    // name getter
    public String getName()
    {
        return name;
    }

    // surname setter
    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    // surname getter
    public String getSurname()
    {
        return surname;
    }

    // athleteNumber setter
    public void setAthleteNumber(int athleteNumber)
    {
        this.athleteNumber = athleteNumber;
    }

    // athleteNumber getter
    public int getAthleteNumber()
    {
        return athleteNumber;
    }

    // dateOfBirth setter
    public void setDateOfBirth(int year, int month, int dayOfMonth)
    {
        this.dateOfBirth = LocalDate.of(year,month,dayOfMonth);
    }

    // dateOfBirth getter
    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }
    
    @Override
    public String toString()
    {
    	return name +" "+ surname + " " + athleteNumber+ " " + dateOfBirth + " ";
    }

}