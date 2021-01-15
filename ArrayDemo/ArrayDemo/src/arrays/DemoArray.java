package arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;

import menu.UserControls;
import util.ArrayEnum;

public class DemoArray {
	// Timers
	static double time = System.nanoTime();
	
	
	
	// DELCARE ARRAY
	static int[] intArr1;
	// also valid
	int intArr2[];
	
	// sample array
	static int[] sampleArr = new int[] {99, 88, 77, 66, 55, 44};
	
	
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

	
	public static boolean searchArray(int s) {
		double startTime = time;
		
		for (int element : sampleArr) {
		    if (element == s) {
		    	double endTime = time - startTime;
				System.out.println(endTime);
				System.out.println("Found");
		        return true;
		    }
		}
		double endTime = startTime -time;
		System.out.println(endTime);
		System.out.println("Not Found");
		return false;
	}
	
	
}
