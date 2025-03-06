package Oct.ex_09102024.Polymorphism.MethodOverriding;

public class Hound extends Dog{

	//By using @Overirde annotation before the method, 
	//local method will override the base method
	//otherwise base method will be executed
	void bark() {
		System.out.println("I am Hound, i will bark");
	}
}
