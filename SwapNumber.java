
public class SwapNumber {

	public static void main(String[] args) {

		int a= 10, b = 30;
		int temp;
		System.out.println("Before Swapping value of a is  "+a+ " and b is  "+b);
		
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping value of a is  "+a+ " and b is  "+b);
	}

}
