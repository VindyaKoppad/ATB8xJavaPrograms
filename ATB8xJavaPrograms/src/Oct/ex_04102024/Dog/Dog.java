package Oct.ex_04102024.Dog;

public class Dog {

	String breed;
	int legs;
	int age;
	String name;
	
	//Default constructor
	Dog(){
		System.out.println("I am DC");
	}
	
	//Parameterized constructor
	Dog(String name,String breed,int age,int legs){
		System.out.println("Iam Parameterized constructor");
		this.name=name;
		this.breed=breed;
		this.age=age;
		this.legs=legs;
	}
	Dog(String breed){
		this.breed=breed;
		System.out.println("I am PC with 1 Parameter");
	}
	void walk() {
		
	}
}
