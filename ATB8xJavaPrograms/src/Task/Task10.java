package Task;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		 //Triangle Classifier
		 /* Write a program that classifies a triangle based on its side lengths.
	     Given three input values representing the lengths of the sides, 
	     determine if the triangle is equilateral (all sides are equal),
	    isosceles (exactly two sides are equal), or
	    scalene (no sides are equal).
	    
	    Use an if-else statement to classify the triangle.
	    side1, side2, side3 */
		//Using scanner class
			
		//Logic building
		//Input-side1,side2,side3- int/float/double
		//Output- String-equilateral,isosceles,scalene
		
		//import scaner class
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("Enter lenth of side1");
		 double side1=sc.nextDouble();
		
		 System.out.println("Enter lenth of side2");
		 double side2=sc.nextDouble();
		
		 System.out.println("Enter lenth of side3");
		 double side3=sc.nextDouble();
		
		if(side1==side2 && side1==side3 && side2==side3) {
			System.out.println("equilateral");
		}
		
		else if(side1==side2 || side1==side3 ||side2==side3) {
				System.out.println("isosceles");
		}
		else{
			System.out.println("scalene");
		}
	}

}
