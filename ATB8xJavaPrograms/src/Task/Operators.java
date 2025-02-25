package Task;

public class Operators {

	public static void main(String[] args) {
		// Prepare calculator which supports +,-,*,/,% Operaters
		double a=34;
		double b=10;
		//Method 1
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);
//		System.out.println(a%b);
		
		//Method 2
		
//		System.out.printf("%f + %f = %f",a,b,a+b);
//		System.out.println();
		
		//Method 3
		
		System.out.printf("Addition of %f and %f is %f",a,b,a+b);
		System.out.println();
		System.out.printf("Subtraction of %f and %f is %f",a,b,a-b);
		System.out.println();
		System.out.printf("Multiplication of %f and %f is %f",a,b,a*b);
		System.out.println();
		System.out.printf("Division of %f and %f is %f",a,b,a/b);
		System.out.println();
		System.out.printf("Remainder of %f and %f is %f",a,b,a%b);
		System.out.println();
	
	}

}
