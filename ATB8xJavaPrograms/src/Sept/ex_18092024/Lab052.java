package Sept.ex_18092024;

public class Lab052 {

	public static void main(String[] args) {
		int cost=100;
		float GST=18.45f;
		
		//int total_price=cost+GST; - Invalid implicit narrowing 
		
		float total_price=cost+GST;// implicit widening 
		System.out.println(total_price);//118.45
		
		int total_price1=cost+(int)GST;// Explicit narrowing - loss
		System.out.println(total_price1);

	
			
		
		
	}

}
