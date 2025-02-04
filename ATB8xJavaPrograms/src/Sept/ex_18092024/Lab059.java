package Sept.ex_18092024;

public class Lab059 {

	public static void main(String[] args) {
		int a = 10;
        System.out.println(++a + a++ + a++);
        /* 
         A=++a=11, a=11
         B=a++=11, 11+1=12=a
         C=a++=12, 12+1=13=a
         A+B+C=11+11+12=34
         
         */
        
        System.out.println(a);//13

	}

}
