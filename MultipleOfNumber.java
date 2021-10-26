
public class MultipleOfNumber {

	public static void main(String[] args) {

		int num = 16;
		/*for(int i = 1; i<=10; i++) {
			System.out.println(num+" * "+i+" = "+ num*i );
		}*/
		
		// using while loop
		int i = 1;
		/*while (i <= 10) {
			System.out.println(num+" * "+i+" = "+ num*i );
			i++;
		}*/
		
		// using do-while
		do {
			System.out.println(num+" * "+i+" = "+ num*i );
			i++;
		} while (i <= 10);
	}
}
