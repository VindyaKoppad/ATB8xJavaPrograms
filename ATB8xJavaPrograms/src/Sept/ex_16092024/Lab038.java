package Sept.ex_16092024;

public class Lab038 {

	public static void main(String[] args) {
		// Relational operators
		//They always return true or false
		//<, >, <=, >=,!, !=, ==
		
		int a=10;
		int b=20;
		Boolean c=a<b;
		System.out.println(c);//true
		
		Boolean d=a>b;
		System.out.println(d);//false
		
		int age_vindya=30;
		int age_xyz=30;
		boolean result=age_vindya<age_xyz;
		System.out.println(result);//false
		
		boolean result1=age_vindya<=age_xyz;
		System.out.println(result1);//true

	}

}
