import java.util.Scanner;
class MobileUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		Mobile mobile =  new Mobile(size);
		
		ApplicationDTO dto  = new ApplicationDTO();
		dto.setAppName("Byju");
		dto.setAppType("Educational");
		dto.setAppSize(64);
		dto.setAppRating(4.5);
		
		mobile.addApplication(dto);
		mobile.printDetails();
	}
}