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

		String text = sc.next();
		do{
			System.out.println("press 1 to get all app details");
			System.out.println("Press 2 to update app name by app type");
			System.out.println("press 3 to delete by app name");
			System.out.println("press 4 to get account name by account id");

			int choice = sc.nextInt();
			switch(choice){
				case 1:
					mobile.printDetails();
					break;
				case 2:
					System.out.println("Enter App Type for which you want to update name");
					String type = sc.next();
					System.out.println("Enter updated App name");
					String name = sc.next();
					boolean update = mobile.updateAppNameByAppType(name, type);
					System.out.println("Update: "+update);
					break;
				case 3:
					System.out.println("Enter App name for which an entry has to be deleted");
					boolean delete = mobile.deleteByAppName(sc.next());
					System.out.println("Delete: "+delete);
					break;
				default:
					System.out.println("Wrong choice.....");
					break;
			}
			System.out.println("Do you want to continue? Y/N");
			text = sc.next();
		} while(text.equals("Y"));
		System.out.println("Thank you for Using the Food Items Application");
	}
}