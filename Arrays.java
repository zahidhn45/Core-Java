import java.util.Scanner;

class Arrays{
	public static void main(String[] args){
		String[] names = {"Zahid", "Rohan", "Rakesh", "Rumi", "Minali"};
		int[] number = {123456, 25461, 326744, 125468,  985675};
		
		for(String s: names){
			System.out.println(s);
		}
		System.out.println("");
		System.out.println("Choose options between names");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		for(int i = 0; i< names.length; i++){
			if(name.equals(names[i])){
				System.out.println("The number  of the contact "+name+" is " +number[i]);
			}
		}
	}
}