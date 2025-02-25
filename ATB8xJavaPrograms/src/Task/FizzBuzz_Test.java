package Task;
import java.util.Scanner;

public class FizzBuzz_Test {

	public static void main(String[] args) {
		//FizzBuzz
		//Write a program that prints numbers from 1 to n 
		//however for multiples of 3, print "Fizz" instead of the number
		//and for multiples of 5 print "Buzz"
		//for numbers that are multiples of both 3 and 5 print "FizzBuzz"
		
		//Step1
		//Input-Number-int n-Scanner class
		//Output-String -Fizz,Buzz,FizzBuzz
		
		//Step2
		//Logic 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
				
			}
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
