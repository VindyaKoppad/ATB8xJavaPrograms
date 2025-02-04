package Sept.ex_18092024;

public class Lab053 {

	public static void main(String[] args) {
		// Increment(++) and Decrement(--) operators
		//Pre and Post
		
		//Pre-increment-> ++operand
		//Value is incremented first and then stored and returns result
		int a=10;
		int b=++a;//a=a+1
		System.out.println(b);//11
		System.out.println(a);//11
		
		int c=10;
		System.out.println(++c);//11 
		System.out.println(c);//11
		
		//Post increment-> operand++
		//print first and then increase 
		int d_post=10;
		System.out.println(d_post++);//10
		System.out.println(d_post);//11
		
		

	}

}
