package Oct.ex_04102024.Human;

public class AHuman {
	//Constructor
	//it is special method which is invoked automatically 
	//at the time of object creation
	//used to initialize the data members of new objects generally 
	// Constructor have the same name as class
	//Constructor don't have the return type 
	//It is called only once at object creation
	
	//1.Default Constructor
	//2.Parameterized Constructor
	
	
	String eye_color;
	String name;
	long aadhar_number;
	
	//Default Constructor
	AHuman(){
		System.out.println("I am default constructor");
	}
	AHuman(String name){
		System.out.println("I am parameterized constructor");
	}
	
	void walk() {
		System.out.println("NRNA function");
	}
	String sleep() {
		System.out.println("WRNA");
		return "8hr";
	}
	void eat(String dish) {
		System.out.println("NRWA");
	}
	int talk(int hour) {
		System.out.println("WRWA");
		return 8;
	}
}
