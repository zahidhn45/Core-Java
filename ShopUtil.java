import java.util.Scanner;
class ShopUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		
		Shop shop = new Shop(size);
		
		ElectronicDeviceDTO dto  = new ElectronicDeviceDTO();
		dto.setDeviceId(123);
		dto.setDeviceName("AC");
		dto.setDeviceColor("White");
		dto.setDevicePrice(1500.00);
		
		shop.addElectronicDevice(dto);
		shop.printDetails();
	}
}