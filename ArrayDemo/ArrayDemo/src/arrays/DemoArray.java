package arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;

import menu.UserControls;

public class DemoArray {
	
	// DELCARE ARRAY
	static int[] intArr1;
	// also valid
	int intArr2[];
	
	// sample array
	static int[] sampleArr = new int[] {99, 88, 77, 66, 55, 44};
	
	
	public void createIntegerArray(int num) {
		Integer[] newArray = new Integer[num];
		for(int i = 0; i < num; i ++) {
			System.out.println("Chose a number for index: " + i);
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			newArray[i] = input;
		}
		
		System.out.println("your new array looks like this!");
		System.out.println(Arrays.toString(newArray));
		
//		for(int i = 0; i < newArray.length; i++) {
//			System.out.println(newArray[i]);
//		}
		
		System.out.println(newArray);
		
		System.out.println("\n ------------------------------------------");
		
		ArraysList.addIntToList(newArray);
		
		UserControls user = new UserControls();
		user.returnToMainMenu();
	}
	
	public void showArrayObject() {
		intArr1 = new int[]{32, 23, 14, 45};
		System.out.println(intArr1);
		for(int i = 0; i < intArr1.length; i++) {
			System.out.println(intArr1[i]);
		}
	}
	
	public void showSampleArr() {
		for(int i = 0; i < sampleArr.length; i++) {
			System.out.println(sampleArr[i]);
		}
	}
	
	public static void addToArray() {
		
	}

	public void createStringArray(int num) {
		
		String[] newArray = new String[num];
		for(int i = 0; i < num; i ++) {
			
			System.out.println("Write a string for index: " + i);
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			newArray[i] = input;
		}
		
		System.out.println("your new array looks like this!");
		System.out.println(Arrays.toString(newArray));
		
		System.out.println(newArray);		
	
		System.out.println("\n ------------------------------------------");
		
		ArraysList.addStrToList(newArray);
		
		UserControls user = new UserControls();
		user.returnToMainMenu();
		
	}
	
	public void createDoubleArray(int num) {
		Double[] newArray = new Double[num];
		for(int i = 0; i < num; i ++) {
			System.out.println("Write a double for index: " + i);
			Scanner scan = new Scanner(System.in);
			Double input = scan.nextDouble();
			newArray[i] = input;
		}
		
		System.out.println("your new array looks like this!");
		System.out.println(Arrays.toString(newArray));
		
		System.out.println(newArray);
		
		System.out.println("\n ------------------------------------------");
		
		ArraysList.addDblToList(newArray);
		
		UserControls user = new UserControls();
		user.returnToMainMenu();
		
	}

	
	
}
