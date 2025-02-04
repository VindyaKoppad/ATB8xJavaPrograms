package Task;

public class Task5 {

	public static void main(String[] args) {
		byte a=10;
		byte b=10;
		//a+b; it will convert to integer 
		int c=a+b;
		System.out.println(c);
		
		char a1='A';//65
		char b1='B';//66
		
		int c1=a1+b1;//it will concatenate ASCII value
		System.out.println(c1);//131
		
		System.out.println(a1);//A
		//Only concatenation will give integer result
		
		/* it will always take bigger one 
			byte+byte=int
			byte+short=int
			short+char=int
			int+int=long
			char+short=int
			int+long=long
			float+long=float
			float+double=double
		*/
		
			
		
		

	}

}
