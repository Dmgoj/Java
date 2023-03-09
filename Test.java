
public class Test {
	
	public static void main(String[] args) {
		Singer janis = new Singer("Janis", "Joplin");
		janis.setName("Lucija");
		
		System.out.println(janis.getName());
		System.out.println(janis.sing("Piece of my heart"));
	}

}
