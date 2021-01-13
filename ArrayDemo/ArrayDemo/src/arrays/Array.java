package arrays;

import java.util.Scanner;

import menu.UserControls;
import util.ArrayEnum;

public class Array {

	
	// Experimenting with new class to remove redundant code.
	public void createArray(ArrayEnum type, int num) {
		EnumArrayController newArray = new EnumArrayController(type, num);
		for(int i = 0; i < num; i ++) {
			System.out.println("Chose a number for index: " + i);
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			newArray.getArray()[i] = input;
		}
		
		System.out.println("your new array looks like this!");
		System.out.println(newArray.getArray().toString());		
		
		System.out.println("\n ------------------------------------------");
		
		ArraysList.addToList(newArray);
		
		UserControls user = new UserControls();
		user.returnToMainMenu();
	}
	
}
