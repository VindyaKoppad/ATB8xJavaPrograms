package Oct.ex_09102024.Polymorphism.MethodOverriding;

public class Lab133 {

	public static void main(String[] args) {
		
		Hound h=new Hound();
		h.bark();//Hound bark will be executed when @override annotation is used
		
		Dog d=new Dog();
		d.bark();//Dog bark will be executed
		
	}
	
}
