import java.util.Scanner;
class HomeUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		
		Home home = new Home(size);
		
		for(int i = 0; i < size; i++){
			FurnitureDTO dto = new FurnitureDTO();
			
			System.out.println("Enter furniture name");
			dto.setFurnitureName(sc.next());
			System.out.println("Enter furniture Number");
			dto.setNumberOfFurniture(sc.nextInt());
			System.out.println("Enter furniture Color");
			dto.setFurnitureColor(sc.next());
			home.addFurniture(dto);
		}
		
		home.printDetails();
		
		System.out.println("Enter furniture name for updating Furniture color");
		String name = sc.next();
		System.out.println("Enter udated furniture color");
		String color = sc.next();
		boolean update = home.updateColorByName(name, color);
		System.out.println("Updated: "+update);
		home.printDetails();
		
		System.out.println("Enter furniture name for which an entery is to be deleted");
		boolean delete = home.deleteByName(sc.next());
		System.out.println("Deleted: "+delete);
		home.printDetails();
	}
}