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
		
		shop.printDetails();
		
		System.out.println("Enter device id for which device name is to be updated");
		int id = sc.nextInt();
		System.out.println("Enter updated device name");
		String name = sc.next();
		boolean update = shop.updateDeviceNameByDeviceId(id, name);
		System.out.println(update);
		shop.printDetails();
		
		System.out.println("Enter device id for which an entry has to be deleted");
		boolean delete = shop.deleteById(sc.nextInt());
		System.out.println(delete);
		shop.printDetails();
	}
}