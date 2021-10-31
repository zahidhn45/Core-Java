import java.util.Scanner;
class HotelUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int pos = 0;
			System.out.println("Enter he maximum Size");
			int size = sc.nextInt();
			
			Hotel hotel = new Hotel(size);
			int ans = 0;
			int answer = 0;
			do{
				System.out.println("What operation do you want to perform");
				System.out.println("1. Add more food item\n2. Read  the added foodItem\n3. Update the existing food item\n4. Delete any food item");
				pos = sc.nextInt();
				switch(pos){
					case 1:
						do{
								System.out.println("Enter Food Id");
								int id = sc.nextInt();
								System.out.println("Enter Food Name");
								String name = sc.next();
								System.out.println("Enter food price");
								double price = sc.nextDouble();
								System.out.println("Enter food Type");
								String type = sc.next();
								FoodItemDTO food = new FoodItemDTO(id, name, price, type);
								
								hotel.createFoodItem(food);
								
								System.out.println("Do you want to add more food item..! \nif Yes Press 1 else any key to exit ");
								ans = sc.nextInt();
							} while(ans == 1);
							break;
					case 2:
							hotel.fetchFoodDetail();
							break;
					case 3:
					ans = 0;
					boolean updated = false;
						if(!hotel.fetchFoodDetail()){
								break;
							}else{
							do{
								System.out.println("Enter the food id for which food entity is to be updated");
								int id = sc.nextInt();
								
								pos  = 0;
								System.out.println("Select a options to update");
								System.out.println("1. Name\n2. Price\n3. Type");
								pos = sc.nextInt();
								System.out.println("Enter updated food entity");
							
								switch(pos){
									case 1:
										updated = hotel.updateFoodNameByFoodId(id, sc.next());
										break;
									case 2:
										updated = hotel.updateFoodPriceByFoodId(id, sc.nextDouble());
										break;		
									case 3:
										updated = hotel.updateFoodTypeByFoodId(id, sc.next());
										break;
									default:
										System.out.println("Select from given options");
								}
								System.out.println("Updated: "+updated);
								System.out.println("Do you want to update more..! \nif Yes Press 1 else any key to exit ");
								ans = sc.nextInt();
							} while(ans == 1);
						}
						break;
					case 4:
							if(!hotel.fetchFoodDetail()){
								break;
							}
							else{
								System.out.println("Enter the food id for which the entry is to be deleted");
								boolean deleted = hotel.deleteByFoodId(sc.nextInt());
								System.out.println("Delete: "+deleted);
							}
							break;
					default:
						System.out.println("Select form the given options");
			} 
			System.out.println("Do you want to perform more operations..! \nif Yes Press 1 else any key to exit ");
			answer = sc.nextInt();
		}while(answer == 1);
	}
}