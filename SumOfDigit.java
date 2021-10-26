
public class SumOfDigit {

	public static void main(String[] args) {

		int num = 123456789;
		int totalSum = 0;
		
		while (num != 0) {
			totalSum += num %10;
			num /= 10;
		}
		System.out.println(totalSum);
	}
}
