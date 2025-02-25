package Task;
import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		//Leap year
		//year % 4 == 0 && year % 100 != 0 || year % 400 == 0
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
		
		if(year%4==0 || year%400==0 && year%100!=0) {
			System.out.println("It is a leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
	}
}
