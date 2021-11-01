import java.util.Scanner;
class ShopUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		
		Shop shop = new Shop(size);
		
		for(int i = 0; i< size; i++){
			ElectronicDeviceDTO dto  = new ElectronicDeviceDTO();
			
			System.out.println("Enter device id");
			dto.setDeviceId(sc.nextInt());
			System.out.println("Enter device Name");
			dto.setDeviceName(sc.next());
			System.out.println("Enter device color");
			dto.setDeviceColor(sc.next());
			System.out.println("Enter device price");
			dto.setDevicePrice(sc.nextDouble());
			
			shop.addElectronicDevice(dto);
		}

		String text = null;
		do{
			System.out.println("press 1 to get all device details");
			System.out.println("Press 2 to update device name by id");
			System.out.println("press 3 to delete device by id");
			System.out.println("press 4 to get device name by account id");
			int choice = sc.nextInt();

			switch(choice){
				case 1:
					shop.printDetails();
					break;
				case 2:
					System.out.println("Enter device id for which device name is to be updated");
					int id = sc.nextInt();
					System.out.println("Enter updated device name");
					String name = sc.next();
					boolean update = shop.updateDeviceNameByDeviceId(id, name);
					System.out.println(update);
					break;
				case 3:
					System.out.println("Enter device id for which an entry has to be deleted");
					boolean delete = shop.deleteById(sc.nextInt());
					System.out.println(delete);
					break;
				case 4:
					System.out.println("Enter device id");
					shop.getDeviceNameById(sc.nextInt());
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