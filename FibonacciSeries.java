
public class FibonacciSeries {

	public static void main(String[] args) {
		int num = 10, firstNumber = 0, secondNumber = 1;
		
		System.out.println("Fibonacci series in given number   "+num+"  is:");
		System.out.print(firstNumber+" \t"+secondNumber);
		for(int i = 2; i< num ; i++) {
			int sum = firstNumber +secondNumber;
			System.out.print("\t"+sum);
			firstNumber = secondNumber;
			secondNumber = sum;
		}
	}

}
