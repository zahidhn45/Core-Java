public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 1634;
		int secNum;
		int temp  = secNum = num;
		int arm = 0, res = 0, count = 0;
		
		// To check the length of given number
		while(num != 0) {
			num /= 10;
			count++;
		}
		
		// To check whether number is Armstrong or not
		do {
			res = secNum %10;
			arm += Math.pow(res, count);
			secNum /= 10;
		} while (secNum != 0);
		if(temp == arm) 
			System.out.println("The number  "+temp+" is Armstrong Number");
		else
			System.out.println("The number  "+temp+" is not a Armstrong Number, Product of number is  "+arm);
	}
}
