import java.util.Scanner;
class HomeUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		
		Home home = new Home(size);
		FurnitureDTO dto = new FurnitureDTO();
		FurnitureDTO dto1 = new FurnitureDTO();
		
		dto.setFurnitureName("Chair");
		dto.setNumberOfFurniture(4);
		dto.setFurnitureColor("Blue");
		
		dto1.setFurnitureName("Table");
		dto1.setNumberOfFurniture(2);
		dto1.setFurnitureColor("white");
		
		home.addFurniture(dto);
		home.addFurniture(dto1);
		home.printDetails();
		
		boolean update = home.updateColorByName("Chair", "Black");
		System.out.println("Updated: "+update);
		home.printDetails();
		
		boolean delete = home.deleteByName("Table");
		System.out.println("Deleted: "+delete);
		home.printDetails();
	}
}