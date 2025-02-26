package Task;
import java.util.Scanner;


public class Facotrial_Program {

	public static void main(String[] args) {
		//Factorial of a given number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		System.out.println(fact);
	}
}
