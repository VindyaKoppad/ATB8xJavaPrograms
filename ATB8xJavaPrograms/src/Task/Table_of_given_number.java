package Task;
import java.util.Scanner;

public class Table_of_given_number {

	public static void main(String[] args) {
		
		//Table of given number
		//Using for loop
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for for loop");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
		}
		
		
		//Using while loop
		System.out.println("Enter the number for while loop");
		int n1=sc.nextInt();
		int j=1;
		while(j<=10) {
			System.out.println(n1+"*"+j+"="+(n1*j));
			j++;
		}
		
	}
}
