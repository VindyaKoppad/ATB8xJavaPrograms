package Oct.ex_09102024.Inheritance.Has_A_Aggregation;

public class Car {

	//Car Has-A Enginee and Tyre
	public void StartCar() {
		new Enginee().start();
		new Tyre().rolling();
	}
	
}
