package Sept.ex_16092024;

public class Lab039 {

	public static void main(String[] args) {
		// Logical operators
		//!, &&, || - logical gates(NOT,AND,OR)
		
		boolean a=true;
		boolean b=true;
		//AND gate
		//1,0=0
		//0,1=0
		//0,0=0
		//1,1=1
		
		boolean c=true && true;
		System.out.println(c); //true
		
		//OR gate
		//1,0=1
		//0,1=1
		//0,0=0
		//1,1=1
		boolean d=true||false;
		System.out.println(d); //true
		
		//OR gate
		//1- 0
		//0 -1
		System.out.println(c); //true
		System.out.println(!c);//false
		System.out.println(!!c);//true
		
		
		

	}

}
