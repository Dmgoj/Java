// Imports java.time package
import java.time.*;
import java.time.format.*;

// Creates class Athlete
public class Athlete
{
    // Sets attributes
    private String name;
    private String surname;
    private int athleteNumber;
    private LocalDate dateOfBirth;

    // creates Athlete constructor
    public Athlete(String name, String surname, int athleteNumber, int year, int month, int dayOfMonth)
    {
        this.name = name;
        this.surname = surname;
        this.athleteNumber = athleteNumber;
        this.dateOfBirth = LocalDate.of(year, month, dayOfMonth);
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
    public String getDateOfBirth()
    {
        return dateOfBirth.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

}