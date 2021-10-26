
public class CountDigitInNumber {

	public static void main(String[] args) {

		int num = 4567569;
		int res = 0;
		int count = 0;
		do {
			res  = num % 10;
			count++;
			num /= 10;
		} while(num != 0);
		System.out.println(count);
	}

}
