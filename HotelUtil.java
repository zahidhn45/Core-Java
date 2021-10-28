import java.util.Scanner;
class HotelUtil{
	public static void main(String[] args){
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		
		Hotel hotel = new Hotel(size);
		
		
		for(int i = 0; i < size; i++){
			FoodItemsDTO food = new FoodItemsDTO();
			
			System.out.println("Enter Food Id");
			food.setFoodId(sc.nextInt());
			System.out.println("Enter Food name");
			food.setFoodName(sc.next());
			System.out.println("Enter Food price");
			food.setFoodPrice(sc.nextDouble());
			System.out.println("Enter Food Type");
			food.setFoodType(sc.next());
			
			hotel.addFoodItems(food);
		}
		
		
		hotel.fetchFoodItems();
		
		System.out.println("Enter Food Id to update Food name");
		int id = sc.nextInt();
		System.out.println("Enter updated Food name");
		String name = sc.next();
		boolean update = hotel.updateFoodNameByFoodId(id, name);
		System.out.println("Update: "+update);
		hotel.fetchFoodItems();
		
		System.out.println("Enter Food id for which an entry to be deleted");
		boolean delete = hotel.DeleteByFoodId(sc.nextInt());
		System.out.println("Deleted: "+delete);
		hotel.fetchFoodItems();
	}
}