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
			System.out.println("press 4 to get device details by device id");
			System.out.println("press 5 to get device details by device name");
			System.out.println("press 6 to get device details by device color");
			System.out.println("press 7 to get device details by device price");
			System.out.println("press 8 to get device name by device id");
			System.out.println("press 9 to get device price by device id");
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
					ElectronicDeviceDTO dto = shop.getDeviceDetailsById(sc.nextInt());
					if(dto != null){
						System.out.println(dto.getDeviceId()+" "+dto.getDeviceName()+" "+dto.getDeviceColor()+" "+dto.getDevicePrice());
					}
					break;
				case 5:
					System.out.println("Enter device Name");
					ElectronicDeviceDTO dto1 = shop.getDeviceDetailsByName(sc.next());
					if(dto1 != null){
						System.out.println(dto1.getDeviceId()+" "+dto1.getDeviceName()+" "+dto1.getDeviceColor()+" "+dto1.getDevicePrice());
					}
					break;
				case 6:
					System.out.println("Enter device color");
					ElectronicDeviceDTO dto2 = shop.getDeviceDetailsByColor(sc.next());
					if(dto2 != null){
						System.out.println(dto2.getDeviceId()+" "+dto2.getDeviceName()+" "+dto2.getDeviceColor()+" "+dto2.getDevicePrice());
					}
					break;
				case 7:
					System.out.println("Enter device price");
					ElectronicDeviceDTO dto3 = shop.getDeviceDetailsByPrice(sc.nextDouble());
					if(dto3 != null){
						System.out.println(dto3.getDeviceId()+" "+dto3.getDeviceName()+" "+dto3.getDeviceColor()+" "+dto3.getDevicePrice());
					}
					break;
				case 8:
					System.out.println("Enter device id");
					System.out.println(shop.getDeviceNameByDeviceId(sc.nextInt()));
					break;
				case 9:
					System.out.println("Enter device id");
					System.out.println(shop.getDevicePricebyDeviceId(sc.nextInt()));
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