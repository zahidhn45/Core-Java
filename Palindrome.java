
public class Palindrome {

	public static void main(String[] args) {

		int num = 12321;
		int dupNum = num;
		int rev = 0;
		
		while(num  != 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		if(rev == dupNum) {
			System.out.println("Given number  "+dupNum+"  is palindrome ");
		} else {
			System.out.println("Given number  "+dupNum+"  is not palindrome ");
		}
	}

}
