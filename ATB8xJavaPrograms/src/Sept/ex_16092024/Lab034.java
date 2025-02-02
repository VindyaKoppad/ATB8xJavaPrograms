package Sept.ex_16092024;

public class Lab034 {

	public static void main(String[] args) {
		// String and integer concatenation
		String first_name="Vindya";
		String last_name="Koppad";
		
		//String + String - it will concatenate both
		System.out.println(first_name+ last_name);
		
		int a=10;
		int b=20;
		
		//int + int - it will do addition
		System.out.println(a=b);
		
		//String+String+int+int - if the first two values are string then it will apply concatenation for all
		System.out.println(first_name+last_name+a+b); //VindyaKoppad
		
		//int+int+String+String -It will do addition then concatenate 
		System.out.println(a+b+first_name+last_name);//40VindyaKoppad
		
		//String+String+(int+int)- concatenate strings then apply addition 
		System.out.println(first_name+last_name+(a+b));

	}

}
