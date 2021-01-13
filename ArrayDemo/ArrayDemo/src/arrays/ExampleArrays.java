package arrays;

public class ExampleArrays {

	public static void runExample() {

		int[] arr1 = {1, 2, 3, 4};
		
		
		
		for( int i =0;i< arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println(arr1);
		
		System.out.println("=================================");
		
		arr1[0] = 12;
		arr1[1] = 23;
		arr1[2] = 45;
		arr1[3] = 67;
		
		for( int i =0;i< arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println(arr1);
		
		System.out.println("=================================");
		
		arr1[0] = 6;
		arr1[1] = 73;
		arr1[2] = 888;
		arr1[3] = 21;
		//arr1[4] = 21;
		
		for( int i =0;i< arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println(arr1);
		
		
		System.out.println("=================================");
		
		arr1 = new int[] {1, 2, 3, 4, 5};
		for( int i =0;i< arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println(arr1);
		
		
	}
	
}
