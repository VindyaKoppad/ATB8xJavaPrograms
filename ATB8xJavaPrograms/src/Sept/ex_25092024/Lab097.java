package Sept.ex_25092024;

public class Lab097 {

	
	public static void main(String[] args) {
		//For loop without A&/B&/C
		
		final boolean b1=true;
		//b1=false; - cannot change the value for final 
		for (int i=0; b1;i++) {
			System.out.println("Hi"); //infinite "Hi" will be printed  since condition b1 is true 
		}
		
		
//		
//		for(int a=0; ;) {
//			System.out.println("Hello"); //-infinite loop
//		}
//		
//		for(; ; ) {
//			System.out.println("How are you?"); - infinite loop
//		}
		
	}
}
