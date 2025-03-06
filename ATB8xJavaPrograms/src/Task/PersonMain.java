package Task;

public class PersonMain {

	public static void main(String[] args) {
		//Objects
		TaskPerson p1=new TaskPerson(); //DC
		
		TaskPerson p2=new TaskPerson(); //DC
		p2.name="Perry";
		System.out.println(p2.name);
		
		TaskPerson p3=new TaskPerson("Vindya"); //PC
		
		TaskPerson p4=new TaskPerson("Sachin"); //PC
		System.out.println(p4.name);
		p4.age=45;
		System.out.println(p4.age);
		
		TaskPerson p5=new TaskPerson("Shash","Bengaluru",45,'M');
		System.out.println(p5.name);
		System.out.println(p5.address);
		System.out.println(p5.age);
		System.out.println(p5.gender);
	}
}
