package Sept.ex_23092024;

public class Lab087 {

	public static void main(String[] args) {
		char c='C';// By default JVM will convert it to its ASCII value (Integer value)
		switch(c) {
		
		default:System.out.println("Invalid input");
		
		case 65:System.out.println("A");
			break;
		case 66:System.out.println("B");
			break;
		case 67:System.out.println("C");
			break;
		case 68:System.out.println("D");
			break;
		
		}
	}

}
