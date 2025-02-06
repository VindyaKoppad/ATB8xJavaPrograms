package Sept.ex_20092024;

public class Lab071 {

	public static void main(String[] args) {
		boolean a = true;
        a = !a;
        //a=true
        //a=!true=false
        
        //a is not used in if condition and else condition is not used so if statement will execute only when its true and 
        //other statement will execute irrespective of if condition
        if (2 + 2 < 4) {
        	System.out.println("Inside the loop");
        }
        //without else
        System.out.println("Outside -> " + a);

	}

}
