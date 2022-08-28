package check;

import constants.Constants;

public class Main {
	
	// 課題①
	private static String firstName = "真弥";
	private static String lastName = "七海";
	
	private static void printName(String firstName, String lastName) {
		System.out.println( "printNameメソッド→" + lastName + firstName);
	}

	public static void main(String[] args) {
		
		// 課題②
		printName(firstName, lastName);
		
		// 課題③
		Pet javaKichi = new Pet (Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		javaKichi.introduce();
		
		RobotPet r2d2 = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		r2d2.introduce();
		
		
	}

}
