package Oct.ex_09102024.Inheritance.SingleInheritance.Realtime;

public class RunnerClass {

	public static void main(String[] args) {
		
		TestCase1 tc1=new TestCase1();
		tc1.startBrowser();
		tc1.readExcelfile();
		tc1.closeBrowser();
		
		TestCase2 tc2=new TestCase2();
		tc2.startBrowser();
		tc2.readExcelfile();
		tc2.closeBrowser();
		
		
		
	}
}
