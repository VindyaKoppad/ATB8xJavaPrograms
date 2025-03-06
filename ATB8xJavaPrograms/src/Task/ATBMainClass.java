package Task;

public class ATBMainClass {
	public static void main(String[] args) {
		TaskATBStudent s1=new TaskATBStudent();
		s1.name="Vindya";
		System.out.println(s1.name);
		TaskATBStudent s2=new TaskATBStudent();
		s2.age=38;
		System.out.println(s2.age);
		TaskATBStudent s3=new TaskATBStudent();
		s3.batch_no=8;
		System.out.println(s3.batch_no);
		TaskATBStudent s4=new TaskATBStudent();
		s4.gender='F';
		System.out.println(s4.gender);
		new TaskATBStudent();//object is created but no reference at this moment
		
	}

	
}
