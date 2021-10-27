import java.util.Scanner;
class ShopUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		
		Shop shop = new Shop(size);
		ElectronicDeviceDTO dto  = new ElectronicDeviceDTO();
		ElectronicDeviceDTO dto1  = new ElectronicDeviceDTO();
		
		dto.setDeviceId(123);
		dto.setDeviceName("AC");
		dto.setDeviceColor("White");
		dto.setDevicePrice(1500.00);
		
		dto1.setDeviceId(456);
		dto1.setDeviceName("Mobile");
		dto1.setDeviceColor("Black");
		dto1.setDevicePrice(45000.00);
		
		shop.addElectronicDevice(dto);
		shop.addElectronicDevice(dto1);
		shop.printDetails();
		
		boolean update = shop.updateDeviceNameByDeviceId(123, "Laptop");
		System.out.println(update);
		shop.printDetails();
		
		boolean delete = shop.deleteById(456);
		System.out.println(delete);
		shop.printDetails();
	}
}