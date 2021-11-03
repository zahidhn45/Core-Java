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

		String text = null;
		do{
			System.out.println("press 1 to get all app details");
			System.out.println("Press 2 to update app name by app type");
			System.out.println("press 3 to delete by app name");
			System.out.println("press 4 to get app details by app type");
			System.out.println("press 5 to get app details by app name");
			System.out.println("press 6 to get app details by app size");
			System.out.println("press 7 to get app details by app Rating");
			System.out.println("press 8 to get app name by app type");
			System.out.println("press 9 to get app type by app name");

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
				case 4:
					System.out.println("Enter app type");
					ApplicationDTO dto = mobile.getAppDetailsByAppType(sc.next());
					if(dto != null){
						System.out.println(dto.getAppName()+" "+dto.getAppType()+ " "+dto.getAppSize()+" "+dto.getAppSize()+" "+dto.getAppRating());
					}
					break;
				case 5:
					System.out.println("Enter app name");
					ApplicationDTO dto1 = mobile.getAppDetailsByAppName(sc.next());
					if(dto1 != null){
						System.out.println(dto1.getAppName()+" "+dto1.getAppType()+ " "+dto1.getAppSize()+" "+dto1.getAppSize()+" "+dto1.getAppRating());
					}
					break;
				case 6:
					System.out.println("Enter app size");
					ApplicationDTO dto2 = mobile.getAppDetailsByAppSize(sc.nextInt());
					if(dto2 != null){
						System.out.println(dto2.getAppName()+" "+dto2.getAppType()+ " "+dto2.getAppSize()+" "+dto2.getAppSize()+" "+dto2.getAppRating());
					}
					break;
				case 7:
					System.out.println("Enter app rating");
					ApplicationDTO dto3 = mobile.getAppDetailsByAppRating(sc.nextDouble());
					if(dto3 != null){
						System.out.println(dto3.getAppName()+" "+dto3.getAppType()+ " "+dto3.getAppSize()+" "+dto3.getAppSize()+" "+dto3.getAppRating());
					}
					break;
				case 8:
					System.out.println("Enter app type");
					System.out.println(mobile.getAppNameByAppType(sc.next()));
					break;
				case 9:
					System.out.println("Enter app name");
					System.out.println(mobile.getAppTypeByAppName(sc.next()));
					break;
				default:
					System.out.println("Wrong choice.....");
					break;
			}
			System.out.println("Do you want to continue? Y/N");
			text = sc.next();
		} while(text.equals("Y"));
		System.out.println("Thank you for Using the Food Items Application");
		sc.close();
	}
}