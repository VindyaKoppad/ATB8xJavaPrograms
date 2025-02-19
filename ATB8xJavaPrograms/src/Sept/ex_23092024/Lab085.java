package Sept.ex_23092024;

public class Lab085 {

	public static void main(String[] args) {
		int a=10;
		int b=4;
		String res="Mod";
		switch(res) {
		case "Add" :System.out.println("Sum of a and b is "+(a+b));
			//System.out.println("Sum of a and b is",(a+b));
					break;
		case "Diff" :System.out.println("Difference of a and b is "+(a-b));
					break;			
		case "Pro" :System.out.println("Product of a and b is "+(a*b));
					break;	
		
		case "Qau" :System.out.println("Quotient of a and b is "+(a/b));
					break;			
		case "Mod" :System.out.println("Modulus of a and b is "+(a%b));
					break;		
				
		default:
			System.out.println("Invalid input");
		}
	}

}
