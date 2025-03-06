package Oct.ex_09102024.Polymorphism.MethodOverloading;

public class Lab132 {

	public static void main(String[] args) {
		MathOperations m=new MathOperations();
		int result1=m.add(3, 4);
		System.out.println(result1);
		
		String result2=m.add("Vindya", "Koppad");
		System.out.println(result2);
		
		int result3=m.add(10, 20, 30);
		System.out.println(result3);
		
		double result4=m.add(10.23565, 20.56564);
		System.out.println(result4);
		
	}
}
