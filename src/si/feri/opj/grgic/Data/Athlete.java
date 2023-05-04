package si.feri.opj.grgic.Data;

// Imports java.time s
import java.time.*;

/**
 * Athlete class represents an Athlete with name, surname, athlete number and date of birth.
 * Class contains methods to set and get athlete's name,surname, number and date of birth.
 * 
 * @author Domagoj Grgić
 */
public class Athlete implements Competition
{
    // Sets attributes
    private String name;
    private String surname;
    private int athleteNumber;
    private LocalDate dateOfBirth;
    Discipline discipline;
    public Discipline getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}

	private Match[] listOfPersonalMatches = new Match[5];

    /**
     * Default constructor that creates a new Athlete object
     */
    public Athlete()
    {

    }

    /**
     * Parameterised constructor that creates a new Athlete object with specified name and surname
     *
     *@param name - athletes name
     *@param surname - athletes surname
     */ 
    public Athlete(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    /**
     * Parameterised constructor that creates a new Athlete object with specified name, surname,
     * athlete number and date of birth
     *
     * @param name - athlete's name
     * @param surname - athlete's surname
     * @param athleteNumber - athlete's number
     * @param dateOfBirth - athlete's date of birth
     */     
    public Athlete(String name, String surname, int athleteNumber, LocalDate dateOfBirth)
    {
    	this(name,surname);
    	this.athleteNumber = athleteNumber;
    	this.dateOfBirth = dateOfBirth;
    }
    
    /**
     * Sets the athlete's name
     *
     * @param name - athlete's name
     */ 
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets the athlete's name
     *
     * @return name of the athlete
     */ 
    public String getName()
    {
        return name;
    }

    /**
     * Sets the athlete's surname 
     *
     * @param surname - athlete's surname
     */ 
    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    /**
     * Gets the athlete's surname
     *
     * @return surname of the athlete
     */ 
    public String getSurname()
    {
        return surname;
    }

    /**
     * Sets the athlete's number 
     *
     * @param ahtleteNumber - athlete's number
     */ 
    public void setAthleteNumber(int athleteNumber)
    {
        this.athleteNumber = athleteNumber;
    }

    /**
     *Gets the athlete's number
     *
     * @return athlete's number
     */ 
    public int getAthleteNumber()
    {
        return athleteNumber;
    }

     /**
     * Sets the athlete's date of birth
     *
     * @param year - athlete's year of birth
     * @param month - athlete's month of birth
     * @param dayOfMonth - athlete's day of birth
     */ 
    public void setDateOfBirth(int year, int month, int dayOfMonth)
    {
        this.dateOfBirth = LocalDate.of(year,month,dayOfMonth);
    }

    /**
     *Gets the athlete's date of birth
     *
     * @return athlete's date of birth
     */ 
    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }
    
    
    
    /**
     * Overrides toString method
     *
     * @return string containing athlete's name, surname, number and date of birth.
     */
    @Override
    public String toString()
    {
    	return name +" "+ surname + " " + athleteNumber+ " " + dateOfBirth + " " + discipline;
    }

	@Override
	public void checkValidity(Venue venue) {
		// check if match is already in list of personal matches method or boolean way
		
		for (int i=0; i<venue.listOfMatches.length; i++) {
			if(venue.listOfMatches[i].athleteExists(surname) && venue.listOfMatches[i] == null) { listOfPersonalMatches[i] = venue.listOfMatches[i];
			break;
			}
		}
	}
}