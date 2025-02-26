package Task;
import java.util.Scanner;

public class Table_of_given_number {

	public static void main(String[] args) {
		
		//Table of given number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}
	}
