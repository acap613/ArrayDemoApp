package arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import menu.UserControls;
import util.ArrayEnum;

public class Array {

	
	// Experimenting with new class to remove redundant code.
	public void createArray(ArrayEnum type, int num) {
		EnumArrayController newArray = new EnumArrayController(type, num);
		
		switch(type) {
			case DOUBLE:				
				for(int i = 0; i < num; i ++) {
					System.out.println("Write a double for index: " + i);
					Scanner scan = new Scanner(System.in);				
					try {
						Double input = scan.nextDouble();
						newArray.getArray()[i] = input;
					}catch(InputMismatchException e) {
						System.out.println("please enter a valid double");
						continue;
					}						
				}
				addAndPrintArray(newArray);
				break;
			case INTEGER:
				for(int i = 0; i < num; i ++) {
					System.out.println("Chose a number for index: " + i);
					Scanner scan = new Scanner(System.in);				
					try {
						int input = scan.nextInt();
						newArray.getArray()[i] = input;
					}catch(InputMismatchException e) {
						System.out.println("please enter a valid integer");
						continue;
					}	
				}
				addAndPrintArray(newArray);
				break;
			case STRING:
				for(int i = 0; i < num; i ++) {					
					System.out.println("Write a string for index: " + i);
					Scanner scan = new Scanner(System.in);				
					try {
						String input = scan.nextLine();
						newArray.getArray()[i] = input;
					}catch(InputMismatchException e) {
						System.out.println("please enter a valid integer");
						continue;
					}	
				}				
				addAndPrintArray(newArray);				
				break;
			default:
				break;		
		}
		
	
		
		
		
		UserControls user = new UserControls();
		user.printMenu();
	}

	private void addAndPrintArray(EnumArrayController e) {
		System.out.println("--Array hashcode => "+ e.getArray());
		System.out.println("--Array elements => " + Arrays.toString(e.getArray()));
		System.out.println("\n ------------------------------------------");
		ArraysList.addToList(e);
		
	}
	
//	public static Object getArray(ArrayEnum type, int num) {
//		
//	}
	
}
