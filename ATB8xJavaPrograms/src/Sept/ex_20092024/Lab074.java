package Sept.ex_20092024;

public class Lab074 {

	public static void main(String[] args) {
		// Grade calculator
		/*Write a program that calculates and displays the letter grade for a given numerical score(A,B,C,D or F)
		*based on the following  grade scale
		*A:90-100, B:80-89, C:70-79, D:60-69, F:0-59
		*/
		
		/* 1. Find the user inputs
		 * score= int score
		 * return= grade,data_type=char
		 */
		
		/* 2.Basic logic
		 * if score>=90 && score<=100 ->A
		 * if score>=89 && score<=80 ->B
		 * if score>=79 && score<=70 ->c
		 * if score>=69 && score<=60 ->D
		 * if score>=0 && score<=59 ->F
		 */
		
		// 3.Write the code
		char grade;
		int score =89;
	
		if(score>=90 && score<=100) {
			grade='A';
		}
		else if(score>=89 && score<=80) {
			grade='B';
		}
		else if(score>=79 && score<=70) {
			grade='C';
		}
		else if(score>=69 && score<=60) {
			grade='D';
		}
		else if(score<0 || score>100) {
			//System.out.println("Invalid output");
			grade='0';	
		}
		else {
			grade='F';
		}
		System.out.println("Your grade is "+grade);
		
		
		
		
	}

}
