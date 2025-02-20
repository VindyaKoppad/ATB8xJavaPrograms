package Sept.ex_23092024;

public class Lab091 {

	public static void main(String[] args) {
		// Concatenation in switch cases
		char ch=67;
		//char ch='A'+2 - can be used 
		switch(ch) {
		
		case 'A':System.out.println("A");
					break;
		case 'A'+1:System.out.println("B");
				break;
		case 'A'+2:System.out.println("C");
				break;
		case 'A'+3:System.out.println("D");
				break;
		
		}

	}

}
