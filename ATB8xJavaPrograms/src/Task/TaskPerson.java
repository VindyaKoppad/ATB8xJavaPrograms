package Task;

public class TaskPerson {

	//Create a person class with 10 Attributes, 
	//5 Behaviour(All types of methods),
	//and use Default constructor and Parameterized constructor
	//to set the values, create 5 objects
	
	//Attributes
	String name;
	char gender;
	long phone_no;
	int age;
	long aadhar_no;
	String address;
	String Profession;
	int salary;
	int legs;
	String hands;
	
	//Methods
	void talk() { //NRNA
		System.out.println("i can talk");
	}
	int sleep() { //WRNA
		return 8;
	}
	void eat(String name) { //NRWA
		System.out.println("I eat dosa");
	}
	String read(String book) { //WRWA
		return "The Magic";
	}
	
	//Constructor
	TaskPerson(){ //DC
		System.out.println("I am DC");
	}
	TaskPerson(String name){ //PC
		System.out.println("I am PC");
		this.name=name;
	}
	
	TaskPerson(String name,String address,int age,char gender){ //PC
		System.out.println("I am PC");
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
	}
	
	
	
	
	
}
