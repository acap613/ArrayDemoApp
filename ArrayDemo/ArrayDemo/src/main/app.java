package main;

import arrays.ExampleArrays;
import arrays.DemoArray;
import menu.UserControls;

public class app {

	public static void main(String[] args) {
		System.out.println("\n|======Welcome to Arrays Demo!==========|");
		//IntegerArray.createArray(10);
		
		//IntegerArray.showArrayObject();
		
		//IntegerArray.showSampleArr();
		
		UserControls us = new UserControls();
		us.printMenu();
		//ExampleArrays.runExample();
		//DemoArray.searchArray(55);
	}
}
