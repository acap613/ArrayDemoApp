package menu;

import java.util.Scanner;

import arrays.Array;
import arrays.ArraysList;
import arrays.DemoArray;
import util.ArrayEnum;

public class UserControls {
	
	public void printMenu() {					
		System.out.println("What would you like to do? \n" +
							"1.) Make a new Array \n" +
							"2.) Edit data in existing Array \n" +
							"3.) Show Arrays \n" +
							"4.) Exit \n");
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		
		switch(input) {
		 	case 1: 
		 		System.out.println("------------------------------------");
		 		System.out.println("You picked make new array\n");		 		
				createNewArray();
		 		break;
		 	case 2: 
		 		System.out.println("------------------------------------");
		 		System.out.println("You picked edit existing array\n"); 		 		
		 		ArraysList.chooseEditArray();
		 		break;
		 	case 3: 
		 		System.out.println("\n------------------------------------");
		 		System.out.println("You picked show Arrays!\n"); 
		 		showArrays();
		 		
		 		break;
		 	case 4: 
		 		System.out.println("------------------------------------");
		 		System.out.println("goodbye...");		 		
		 		System.exit(1);
		 		break;
		 	default:
		 		System.out.println("------------------------------------");
		 		System.out.println("goodbye...");		 		
		 		System.exit(1);
		 		break;
		}
		
	}
	
	private void showArrays() {
		ArraysList.printArrayList();
		printMenu();
	}

	public void createNewArray(){		
 		System.out.println("------------------------------------");
		System.out.println("Let's Create a new Array!");			
		System.out.println("What kind of array would you like to make? \n" +
							"1.) Integer \n" +
							"2.) String \n" +	
							"3.) Double \n" +
							"4.) Go Back to Main Menu \n");
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		
		switch(input) {
		 	case 1: 
		 		System.out.println("------------------------------------");
		 		System.out.println("You Picked Integer Array");
		 		Array intArr = new Array();
		 		System.out.println("How long would you like this new Array to be?");		 	
				int choice1 = scan.nextInt();
				intArr.createArray(ArrayEnum.INTEGER, choice1);
		 		break;
		 	case 2: 
		 		System.out.println("------------------------------------");
		 		System.out.println("You picked String array!"); 
		 		Array strArr = new Array();
		 		System.out.println("How long would you like this new Array to be?");		 	
				int choice2 = scan.nextInt();
				strArr.createArray(ArrayEnum.STRING, choice2);
		 		break;
		 	case 3:
		 		System.out.println("------------------------------------");
		 		System.out.println("You picked Double array!"); 
		 		Array dblArr = new Array();
		 		System.out.println("How long would you like this new Array to be?");		 	
				int choice3 = scan.nextInt();
				dblArr.createArray(ArrayEnum.DOUBLE,choice3);
		 		break;
		 	
		 	case 4: 
		 		System.out.println("------------------------------------");
		 		System.out.println("goodbye...");		 		
		 		System.exit(1);		 	
		 	default:
		 		break;
		 		
		}
	}
	

}
