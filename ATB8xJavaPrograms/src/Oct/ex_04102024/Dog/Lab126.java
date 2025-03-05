package Oct.ex_04102024.Dog;

public class Lab126 {

	public static void main(String[] args) {
		
		Dog gs=new Dog();//Default constructor will be called
		
		Dog bd=new Dog("BD","AA",2,4);//Parameterized constructor with 4 parameters
		System.out.println(bd.breed);
		System.out.println(bd.name);
		System.out.println(bd.age);
		System.out.println(bd.legs);
		
		Dog AB=new Dog("AB");//Parameterized constructor with 2 parameter will be called
		System.out.println(AB.breed);
	}
}
