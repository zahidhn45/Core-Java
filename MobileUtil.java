import java.util.Scanner;
class MobileUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		Mobile mobile =  new Mobile(size);
		ApplicationDTO dto  = new ApplicationDTO();
		ApplicationDTO dto1  = new ApplicationDTO();
		
		dto.setAppName("Byju");
		dto.setAppType("Educational");
		dto.setAppSize(64);
		dto.setAppRating(4.5);
		
		dto1.setAppName("PUBG");
		dto1.setAppType("Gamming");
		dto1.setAppSize(1024);
		dto1.setAppRating(4.0);
		
		mobile.addApplication(dto);
		mobile.addApplication(dto1);
		mobile.printDetails();
		
		boolean update = mobile.updateAppNameByAppType("Clash of clan", "Gamming");
		System.out.println("Update: "+update);
		mobile.printDetails();
		
		boolean delete = mobile.deleteByAppName("Byju");
		System.out.println("Delete: "+delete);
		mobile.printDetails();
	}
}