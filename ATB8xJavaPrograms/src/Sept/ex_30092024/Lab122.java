package Sept.ex_30092024;

public class Lab122 {

	public static void main(String[] args) {
		//1. Without parameter and without return type
		function_type1();
		//2.Without parameter and with return type
		String name=function_type2();
		System.out.println(name);
		//3.With parameter and without return type
		function_type3("Vindya");
		f_type3(25,"Vindya","Koppad");
		//4.With parameter and with return type
		int sum=function_type4(4,10);
		System.out.println(sum);
	}
	
	//1. Without parameter and without return type
	public static void function_type1(){
		System.out.println("function-type1 is Without parameter and without return type");
	}
	//2.Without parameter and with return type
	//Return type functions always have data_types
	public static String function_type2() {
		System.out.println("function_type2 is Without parameter and with return type");
		return "Vindya";
	}
	//3.With parameter and without return type
	public static void function_type3(String name) {
		System.out.println("Function_type3 is With parameter and without return type");
		System.out.println("You have passed parameter ->"+name);
	}
	public static void f_type3(int age,String fname,String lname) {
		System.out.println("F_type3 is With parameter and without return type");
		System.out.println("Your first name  ->"+fname);
	}
	//4.With parameter and with return type
	public static int function_type4(int a,int b) {
		System.out.println("function_type4 is With parameter and with return type");
		return a+b;
	}
			
			
			
}
