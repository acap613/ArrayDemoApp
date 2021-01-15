package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import menu.UserControls;
import util.ArrayEnum;

public class ArraysList {
	
	public static List<EnumArrayController> arrList = new ArrayList<>();
	public static Scanner scan = new Scanner(System.in);
	
	public ArraysList(Scanner scan) {
		this.scan = scan;
	}
	
	
	public List<EnumArrayController> getArrayList(){
		return arrList;
	}
	
	public static Object getArrayFromList(int num){
		return arrList.get(num).getArray();
	}
	
	public static void printArrayList() {	
		System.out.println("\nPrinting...");
		for(int i =0; i< arrList.size(); i++) {
			System.out.println("\nArray at index: " + i + " " + arrList.get(i).getArray().toString());
			System.out.println("is: " + " " + Arrays.toString(arrList.get(i).getArray()));
		}				
	}

	public static void chooseEditArray() {
		System.out.println("Choose an array to edit");
		for(int i =0; i< arrList.size(); i++) {			
			System.out.println((i+1)+".) " + Arrays.toString(arrList.get(i).getArray()));
		}	
		
		int input = Integer.parseInt(scan.nextLine())-1;
		EnumArrayController arr = arrList.get(input);
		System.out.println("\n--------------------");
		System.out.println("You picked array at index " + (input) + ":" + getArrayFromList(input));
		System.out.println(Arrays.toString(arr.getArray()));
		
		editArray(arr, input, scan);
//		System.out.println("what index in this array would you like to change?");
//		
//		for(int i = 0; i < arrList.get(input).getArray().length; i++) {
//			System.out.println((i+1)+".) " + arr[i]);
//		}
//		int index = scan.nextInt()-1;
//		System.out.println("What would you like the new value to be?");
//		int choice = scan.nextInt();
//		arr[index] = choice;
//		System.out.println(Arrays.toString(arrList.get(input).getArray()) + arr);
//		UserControls uc = new UserControls();
//		uc.printMenu();
	}
	
	public static void addToList(EnumArrayController enumArr) {
		arrList.add(enumArr);
	}

	public static void editArray(EnumArrayController arr, int input, Scanner scan) {
		System.out.println("what index in this array would you like to change?");		
		for(int i = 0; i < arrList.get(input).getArray().length; i++) {
			System.out.println((i+1)+".) " + arr.getArray()[i]);
		}
		int index = Integer.parseInt(scan.nextLine())-1;
		System.out.println("What would you like the new value to be?");
		String str = scan.nextLine();
		switch(arr.getType()) {
			case INTEGER:
				//Integer choice = scan.nextInt();
				arr.getArray()[index] = Integer.parseInt(str);				
				break;
			case DOUBLE:
				//Double choice2 = scan.nextDouble();
				arr.getArray()[index] = Double.parseDouble(str);
				break;
			case STRING:
				//String choice3 = scan.nextLine();
				arr.getArray()[index] = str;	
				break;
			default:
				System.out.println("error...");
				break;
		}
		System.out.println(Arrays.toString(arrList.get(input).getArray()) + arr.getArray().toString());
		UserControls uc = new UserControls();
		uc.printMenu();
	}
}
