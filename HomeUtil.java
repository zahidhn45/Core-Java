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

		String text = null;
		do{
			System.out.println("press 1 to get all furnature details");
			System.out.println("Press 2 to update color name by name");
			System.out.println("press 3 to delete furnature by name");
			System.out.println("press 4 to get furnature detail by furnature name");
			System.out.println("press 5 to get furnature detail by furnature color");
			System.out.println("press 6 to get furnature detail by furnature Number of furnature");
			System.out.println("press 7 to get furnature name by furnature color");
			System.out.println("press 8 to get furnature color by furnature name");
			System.out.println("press 9 to get furnature number of furnature by furnature name");

			int choice = sc.nextInt();
			switch(choice){
				case 1:
					home.printDetails();
					break;
				case 2:
					System.out.println("Enter furniture name for updating Furniture color");
					String name = sc.next();
					System.out.println("Enter udated furniture color");
					String color = sc.next();
					boolean update = home.updateColorByName(name, color);
					System.out.println("Updated: "+update);
					break;
				case 3:
					System.out.println("Enter furniture name for which an entery is to be deleted");
					boolean delete = home.deleteByName(sc.next());
					System.out.println("Deleted: "+delete);
					break;
				case 4:
					System.out.println("Enter name");
					FurnitureDTO dto = home.getFurnitureDetailsByName(sc.next());
					if(dto != null){
						System.out.println(dto.getFurnitureName()+" "+dto.getFurnitureColor()+" "+dto.getNumberOfFurniture());
					}
					break;
				case 5:
					System.out.println("Enter color");
					FurnitureDTO dto1 = home.getFurnitureDetailsByColor(sc.next());
					if(dto1 != null){
						System.out.println(dto1.getFurnitureName()+" "+dto1.getFurnitureColor()+" "+dto1.getNumberOfFurniture());
					}
					break;
				case 6:
					System.out.println("Enter Number of furniture");
					FurnitureDTO dto2 = home.getFurnitureDetailsByNoOfFur(sc.nextInt());
					if(dto2 != null){
						System.out.println(dto2.getFurnitureName()+" "+dto2.getFurnitureColor()+" "+dto2.getNumberOfFurniture());
					}
					break;
				case 7:
					System.out.println("Enter furniture color");
					System.out.println(home.getNameByColor(sc.next()));
					break;
				case 8:
					System.out.println("Enter furniture name");
					System.out.println(home.getColorByName(sc.next()));
					break;
				case 9:
					System.out.println("Enter furniture name");
					System.out.println(home.getNoOfFurnatureByName(sc.next()));
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