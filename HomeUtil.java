import java.util.Scanner;
class HomeUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		
		Home home = new Home(size);
		FurnitureDTO dto = new FurnitureDTO();
		dto.setFurnitureName("Chair");
		dto.setNumberOfFurniture(4);
		dto.setFurnitureColor("Blue");
		
		home.addFurniture(dto);
		home.printDetails();
	}
}