package Task;

import java.util.Scanner;

public class While_vs_DoWhile {

	public static void main(String[] args) {
		//While v/s Do-While
		//Employee can work up to age 62
		
		//While loop- it is an entry control loop
		//Syntax->Initialization | Condition | Body(Execution) | Increment/Decrement
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee age");
		int age1=sc.nextInt();
		while(age1<62) {
			System.out.println("Employee can work at age "+age1);
			age1++;
			
		}
		
		
		//Do-While loop- It is an exit control loop 
		//Syntax->Initialization | Body(Execution) | Condition |Increment/Decrement
		System.out.println("Enter the employee age");
		int age2=sc.nextInt();
		 do{
			System.out.println("Employee can work at age "+age2);
			age2++;
			
		}while(age2<62);
		
		
	}
}
 