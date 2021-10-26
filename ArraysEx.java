public class ArraysEx {

	public static void main(String[] args) {
		
		// String Array
		String[] strArray = { "Rohan", "Ravi","Rumi", "Akash", "Karan"};
		
		for(int i = 0; i<= strArray.length-1; i++) {
			System.out.println("The element at index:- "+i +" is:- "+strArray[i]);
		}
		
		System.out.println("");
		
		// Double Array
		double[] boolArray = { 12.54, 14.25, 36.36, 45.99, 69.36};
		
		for(int i = 0; i<= boolArray.length-1; i++) {
			System.out.println("The element at index:- "+i +" is:- "+boolArray[i]);
		}
		
		System.out.println("");
		System.out.println("Increment by 10");
		
		for(int i = 0; i<= boolArray.length-1; i++) {
			System.out.println("The element at index:- "+i +" is:- "+(boolArray[i]+10));
		}
	}
}
