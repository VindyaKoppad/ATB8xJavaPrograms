package Oct.ex_09102024.Polymorphism.MethodOverriding.Example;

public class Lab134 {

	public static void main(String[] args) {
		Son s=new Son();
		s.home();//Son Home will be called when @override is used
		//Son don't have home method so Father home method is called
		
		Father f=new Father();
		f.home();
		
		//Dynamic Dispatch
		
		Father object=new Son();
		object.home();
		//example 
		//WebDriver driver=new ChromeDriver();
		
	}
}
