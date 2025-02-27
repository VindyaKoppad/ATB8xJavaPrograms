package Task;
 
public class Sum_of_1to100 {

	public static void main(String[] args) {
		//Sum of numbers from 1 to 100 using 
		//While loop
		int sum=0;
		int i=0;
		while(i<=100){
			sum=sum+i;
			i++;
			
		}System.out.println(sum);
		
		//Do while
		int sum1=0;
		int j=0;
		do {
			sum1=sum1+j;
			j++;
		}while(j<=100);
		System.out.println(sum1);
		
	}
}
