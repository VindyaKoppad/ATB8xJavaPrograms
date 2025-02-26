package Task;

public class First5_Even_numbers_do_While {

	public static void main(String[] args) {
		//Print the first 5 even numbers using do-while loop
		
		
		int n=2;
		int count=0;
		do {
			System.out.println(n);
			n=n+2;
			count++;
		}while(count<5);
	}
}
