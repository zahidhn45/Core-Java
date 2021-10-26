
public class SumOfNumber {

	public static void main(String[] args) {

		int startNum = 5, endNum = 25, sum = 0;
		
		/*for(int i = startNum; i<= endNum; i++) {
			sum += i;
		}
		System.out.println("Sum of natural number of  "+startNum+"  to  "+endNum+"  is  "+sum);
		*/
		// using while loop
		/*while (startNum <= endNum) {
			sum += startNum;
			startNum++;
		}
		System.out.println("Sum of natural number of  "+startNum+"  to  "+endNum+"  is  "+sum);*/
		
		// using do-while loop
		do {
			sum += startNum;
			startNum++;
		} while (startNum <= endNum);
		System.out.println("Sum of natural number of  "+startNum+"  to  "+endNum+"  is  "+sum);
	}

}
