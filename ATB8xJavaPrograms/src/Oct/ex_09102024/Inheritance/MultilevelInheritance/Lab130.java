package Oct.ex_09102024.Inheritance.MultilevelInheritance;

public class Lab130 {

	public static void main(String[] args) {
		//Multilevel Inheritance
		//GrandFather->Father->Son
		//Son class can access methods from GrandFather and Father classes
		
		Son s=new Son();
		//If son class does not have home method then Father home will be called, 
		//if father also don't have then GrandFather home will be called
		s.home();//Son Home will be called(Local method)
		s.bike();//Son bike
		s.flat();//GrandFather flat
		s.shop();//Father shop
		
	}
}
