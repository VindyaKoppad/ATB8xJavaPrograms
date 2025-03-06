package Oct.ex_09102024.Polymorphism.MethodOverloading;

public class MathOperations {

	
	//Polymorphism is the ability of an object to take many forms
	//1.Method Overloading
	//2.Method Overriding
	
	
	//1.Method Overloading- same name but different parameters/Arguments, return type
	
	int add(int a,int b) {
		return a+b;
		
	}
	String add(String a,String b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	
	double add(double a,double b) {
		return a+b;
		
	}
	
}
