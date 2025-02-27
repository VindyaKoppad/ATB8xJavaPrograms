package Sept.ex_30092024;

public class Lab121 {

	public static void main(String[] args) {
		//1. Without parameter and without return type
		
		//Calling the function in main method
		greet(); //Calling it first time
		greet(); //Calling 2nd time
		// Repeated calling   
		for(int i=0;i<=10;i++) { 
			greet();
		}
	}
	//Defining the function
	public static void greet() { 
		System.out.println("Hi");
	}
}
