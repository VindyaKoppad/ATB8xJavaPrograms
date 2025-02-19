package Sept.ex_23092024;

public class Lab079 {

	public static void main(String[] args) {
		//Opening the browser which user wants to execute the code
		//Chrome- execute chrome
		//Firefox- execute Firefox
		//Edge - execute Edge
		//Default - Opera, etc
		
		String browser="Edge";
		switch(browser) {
		
		case "Chrome":System.out.println("Starting the Chrome browser");
						//Further code to start the chrome browser
						//webdriver driver=new chrome();
						break;
						
		case "Firefox":System.out.println("Starting the Firefox browser");
						break;
						
						
		case "Edge":System.out.println("Starting the Edge browser");
						break;
		
		default:System.out.println("I have no idea which browser it is");
						
						
		}
		

	}

}
