package menu;

import java.util.Scanner;

import arrays.ArraysList;
import arrays.DemoArray;

public class UserControls {
	
	public void printMenu() {
		System.out.println("|======Welcome to Arrays Demo!==========|");			
		System.out.println("What would you like to do? \n" +
							"1.) Make a new Array \n" +
							"2.) Edit data in existing Array \n" +
							"3.) Show Arrays \n" +
							"4.) Exit Porgarm \n");
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		
		switch(input) {
		 	case 1: 
		 		System.out.println("------------------------------------");
		 		System.out.println("you picked new array!");		 		
				createNewArray();
		 		break;
		 	case 2: 
		 		System.out.println("------------------------------------");

		 		System.out.println("you picked edit array!"); 
		 		break;
		 	case 3: 
		 		System.out.println("------------------------------------");

		 		System.out.println("You picked show Arrays!"); 
		 		showArrays();
		 		
		 		break;
		 	case 4: 
		 		System.out.println("------------------------------------");

		 		System.out.println("goodbye...");
		 		
		 		System.exit(1);
		 		break;
		 	default:
		 		break;
		}
		
	}
	
	private void showArrays() {
		// TODO Auto-generated method stub
		
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
		 		DemoArray intArr = new DemoArray();
		 		System.out.println("How long would you like this new Array to be?");		 	
				int choice1 = scan.nextInt();
				intArr.createIntegerArray(choice1);
		 		break;
		 	case 2: 
		 		System.out.println("------------------------------------");
		 		System.out.println("You picked String array!"); 
		 		DemoArray strArr = new DemoArray();
		 		System.out.println("How long would you like this new Array to be?");		 	
				int choice2 = scan.nextInt();
				strArr.createStringArray(choice2);
		 		break;
		 	case 3:
		 		System.out.println("------------------------------------");
		 		System.out.println("You picked Double array!"); 
		 		DemoArray dblArr = new DemoArray();
		 		System.out.println("How long would you like this new Array to be?");		 	
				int choice3 = scan.nextInt();
				dblArr.createDoubleArray(choice3);
		 		break;
		 	
		 	case 4: 
		 		System.out.println("------------------------------------");
		 		System.out.println("goodbye...");		 		
		 		System.exit(1);		 	
		 	default:
		 		break;
		 		
		}
	}
	
	

	public void returnToMainMenu() {
		
		printMenu();
	}
	

}
