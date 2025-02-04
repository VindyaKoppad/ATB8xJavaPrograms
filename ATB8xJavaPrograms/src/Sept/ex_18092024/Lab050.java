package Sept.ex_18092024;

public class Lab050 {

	public static void main(String[] args) {
		//Type Casting 
		//Widening -Implicit, Explicit 
		//Narrowing- Implicit,Explicit(with loss of data)
		
		
		//Widening 
		byte b=10;
		int a=b;//Implicit widening-JVM
		int a1=(int)b;//Explicit widening 
		
		//Narrowing
		int val=300;
		//byte b1=val; Implicit narrowing (cannot convert from int to byte- JVM)
		
		byte b2=(byte)val;//Explicit narrowing with loss of data 
		System.out.println(b2); //44
		
		//int val=300 this binary require 32 bit, binary code = 00000000000000000000000100101100
		//byte b2=(byte)val; byte has 8 bits memory, which can store only 00101100 (44) from 300 
		

	}

}
