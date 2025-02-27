package Task;

public class First5_Even_numbers_do_While {

	public static void main(String[] args) {
		//Print the first 5 even numbers from 2 using do-while loop
		//do-while
		int n=2;
		int count=0;
		do {
			System.out.println(n);
			n=n+2;
			count++;
		}while(count<5);
		
		int n1=2;
		int count1=0;
		while(count1<5) {
			if(n1%2==0) 
			{
				System.out.println(n1);
				count1++;
			}
			n1++;
		}
		
		//do while with modulus operator
		int n2=2;
		int count2=0;
		 do{
			if(n2%2==0) 
			{
				System.out.println(n2);
				count2++;
			}
			n2++;
		}while(count2<5);
	}
}
