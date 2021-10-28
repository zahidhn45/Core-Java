import java.util.Scanner;
class MobileUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		Mobile mobile =  new Mobile(size);
		
		for(int i = 0; i< size; i++){
			ApplicationDTO dto  = new ApplicationDTO();
			
			System.out.println("Enter App name");
			dto.setAppName(sc.next());
			System.out.println("Enter App Type");
			dto.setAppType(sc.next());
			System.out.println("Enter App size");
			dto.setAppSize(sc.nextInt());
			System.out.println("Enter App Rating");
			dto.setAppRating(sc.nextDouble());
			
			mobile.addApplication(dto);
		}
		
		
		mobile.printDetails();
		
		System.out.println("Enter App Type for which you want to update name");
		String type = sc.next();
		System.out.println("Enter updated App name");
		String name = sc.next();
		boolean update = mobile.updateAppNameByAppType(name, type);
		System.out.println("Update: "+update);
		mobile.printDetails();
		
		System.out.println("Enter App name for which an entry has to be deleted");
		boolean delete = mobile.deleteByAppName(sc.next());
		System.out.println("Delete: "+delete);
		mobile.printDetails();
	}
}