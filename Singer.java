
public class Singer {

	private String name;
	private String surname;
	private int age;
	private boolean alive;
	
	public Singer(String name, String surname) {
		this.name=name;
		this.surname=surname;
	}
	
	public String sing(String name) {
		return name+"!";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
		
}
