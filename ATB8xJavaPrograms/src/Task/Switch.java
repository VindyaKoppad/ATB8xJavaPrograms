package Task;

public class Switch {

	public static void main(String[] args) {
		//Create a simple calculator that performs 
		//addition,subtraction,multiplication,division and modulus 
		//based on user input using switch conditions
		
		int num1=10;
		int num2=4;
		String res="*";
		switch(res) {
		case "+" :System.out.println("Sum of a and b is "+(num1+num2));
			//System.out.println("Sum of a and b is",(a+b));
					break;
		case "-" :System.out.println("Difference of a and b is "+(num1-num2));
					break;			
		case "*" :System.out.println("Product of a and b is "+(num1*num2));
					break;	
		
		case "/" :System.out.println("Quotient of a and b is "+(num1/num2));
					break;			
		case "%" :System.out.println("Modulus of a and b is "+(num1%num2));
					break;		
				
		default:
			System.out.println("Invalid operation");
		}

	}

}
