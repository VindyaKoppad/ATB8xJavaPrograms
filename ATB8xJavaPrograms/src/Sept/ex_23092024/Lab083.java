package Sept.ex_23092024;

public class Lab083 {

	public static void main(String[] args) {
		// Multiple match 
		int itemcode=006;
		switch(itemcode) {
		case 01,03,05:System.out.println("These are electronic items");
							break;
							
		case 002,04:System.out.println("These are mechanical items");
							break;
		
		case 006: System.out.println("These are cosmetics");
					break;
					
		default:System.out.println("None");
		
		
		
		}

	}

}
