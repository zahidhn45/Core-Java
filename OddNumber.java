
public class OddNumber {

	public static void main(String[] args) {

		int minNum = 15, maxNum = 35;
		/*System.out.print("Odd number between "+minNum+" and "+maxNum+ " is ");
		for(int i = minNum; i<= maxNum; i++) {
			if(i % 2 != 0) {
				System.out.print("\t "+i);
			}
		}*/
		
		// using while loop
		/*System.out.print("Odd number between  "+minNum+" and "+ maxNum+" is  ");
		while (minNum <= maxNum) {
			System.out.print(minNum + "\t");
			minNum += 2;
		}*/
		
		// using do-while loop
		System.out.print("Odd number between  "+minNum+" and "+ maxNum+" is  ");
		do {
			System.out.print(minNum + "\t");
			minNum += 2;
		} while (minNum <= maxNum);
	}

}
