package Sept.ex_23092024;

public class Lab089 {

	public static void main(String[] args) {
		char c='B';// By default JVM will convert it to its ASCII value (Integer value)
		switch(c) {
		
		default:System.out.println("Invalid input");
		
		case 'A':System.out.println("65");
			break;
		case 'B':System.out.println("66");
			break;
		case 'C':System.out.println("67");
			break;
		case 'D':System.out.println("68");
			break;
	}
	}
}
