package Oct.ex_09102024.Inheritance.HierarchicalInheritance;

public class Lab131 {

	public static void main(String[] args) {
		Child1 ch1=new Child1();
		ch1.c1();//Child1 home
		ch1.home();//Father home
		
		Child2 ch2=new Child2();
		ch2.c2();//Child2 home
		ch2.home();//Father home
		
		Child3 ch3=new Child3();
		ch3.c3();//Child3 home
		ch3.home();//Father home
		
		Father f=new Father();
		f.home();//Father home
	}
}
