package Task;

public class Switch1 {

	public static void main(String[] args) {
		// kilometers × 1000 = meters
		//Celsius = (Fahrenheit - 32) * 5/9
		float val=92;
		String ope="Meter";
		switch(ope) {
		
		case "Meter":System.out.println(val + " kilometers in meters is " + (val*1000));
					break;
		case "Celsius":System.out.println(val + " Fahrenheit in Celsius is " + ((val-32)*5/9));
					break;
		default:System.out.println("Invalid operation");
		
		
		
		}
	}

}
