package Sept.ex_13092024;

public class Lab024 {

	public static void main(String[] args) {
		//char Literal
		//Single char
		char c1='A';
		char c2='B';
		char c3='C';
		
		//Escape char
		char new_line='\n';
		char tab_line='\t';
		char back_space='\b';
		char car_r='\r';
		
		System.out.println("Vindya"+new_line+"Koppad"); //Vindya \n Koppad 
		
		System.out.println("Vindya"+tab_line+"Koppad");//Vindya 4spaces Koppad
		System.out.println("Vindya"+back_space+"Koppad"); //VindyaKoppad
		System.out.println("Vindya"+car_r +"Koppad");
		
		//ASCII char
		char c='A'; //65 in ASCII
		
		//Scientific /exponent N literal
		float f=129.88e3F;
		double d=129.3387e+2;
		double d1=129.7758e-2;
		System.out.println(f);
		System.out.println(d);
		System.out.println(d1);
		
	}

}
