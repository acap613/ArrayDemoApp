package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysList {
	
	public static List<EnumArrayController> arrList = new ArrayList<>();
	
	
	
	public List<EnumArrayController> getArrayList(){
		return arrList;
	}
	
	public static void printArrayList() {
//		for(Object list: arrList) {
//			System.out.println(list);
//		}
		
		for(int i =0; i< arrList.size(); i++) {
			System.out.println(i + " " + arrList.get(i).getArray().toString());
//			System.out.println(arrList.get(i));
//			for(Object value: arrList) {
//				System.out.println(value);
//			}
		}
				
	}
	
//	public static void addIntToList(Integer[] arr) {
//		arrList.add(arr);
//	}	
//
//	public static void addStrToList(String[] newArray) {
//		// TODO Auto-generated method stub
//		arrList.add(newArray);		
//	}
//	
//	public static void addDblToList(Double[] newArray) {
//		arrList.add(newArray);
//	}
	
	public static void addToList(EnumArrayController enumArr) {
		arrList.add(enumArr);
	}

}
