package Oct.ex_04102024;

public class Lab127 {

	public static void main(String[] args) {
		//Person class will not take memory until 
		//the its object is created and called in main method
		Person p1=new Person();
		p1.name="Vindya";
		p1.gender="F";
		
		Person p2=new Person();
		p2.name="Shash";
		p2.gender="M";
		
		ATBStudent s=new ATBStudent();
		
	}
}
