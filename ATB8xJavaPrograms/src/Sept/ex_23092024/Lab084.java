package Sept.ex_23092024;

public class Lab084 {

	public static void main(String[] args) {
		
		//Switch statements without using break keyword instead -> (Arrow )
		//Here multiple statements are not allowed
		
		int itemcode=04;
		switch(itemcode) {
		case 01,03,05->System.out.println("These are electronic items");
							
		case 002,04->System.out.println("These are mechanical items");
							
		case 006-> System.out.println("These are cosmetics");
					//System.out.println("One more statement"); - not supported  while using ->
		default->System.out.println("None");
		

	}

}
	
}

