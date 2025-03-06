package Oct.ex_09102024.Inheritance.SingleInheritance.Example1;

public class Lab128 {

	public static void main(String[] args) {
		//Son class object 
		Son s=new Son();
		s.bhk3();
		s.bhk2();
		System.out.println(s.money);
		
		Father f=new Father();
		f.bhk2();
		System.out.println(f.money);
		
		
	}
}
