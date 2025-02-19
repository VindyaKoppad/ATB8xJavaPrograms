package Sept.ex_23092024;

public class Lab075 {

	public static void main(String[] args) {
		//Switch condition 
		//Write a code to display Days from Sunday to Saturday 
		//Day 1 to 7-> 1- Monday, 2-Tuesday......7 -Saturday
		int day=6;
		switch(day) {
		
		case 1:System.out.println("Sunday");
				break;
				
		case 2:System.out.println("Monday");
				break;
		
		case 3:System.out.println("Tuesday");
				break;
		
		case 4:System.out.println("Wednesday");
				break;
		
		case 5:System.out.println("Thursday");
				break;
		
		case 6:System.out.println("Friday");
				break;
		
		case 7:System.out.println("Saturday");
				break;
		
		default:
			System.out.println("No idea what day it is");
		
		
		}
		System.out.println("End of the loop");
		
		
	}

}
