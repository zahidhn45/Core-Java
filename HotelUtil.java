import java.util.Scanner;
class HotelUtil{
	public static void main(String[] args){
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		
		Hotel hotel = new Hotel(size);
		FoodItemsDTO food = new FoodItemsDTO();
		FoodItemsDTO food1 = new FoodItemsDTO();
		
		food.setFoodId(1);
		food.setFoodName("Pasta");
		food.setFoodPrice(106.20);
		food.setFoodType("Chinese");
		
		food1.setFoodId(2);
		food1.setFoodName("Gobi");
		food1.setFoodPrice(60.20);
		food1.setFoodType("Chinese");
		
		hotel.addFoodItems(food);
		hotel.addFoodItems(food1);
		hotel.addFoodItems();
		
		boolean update = hotel.updateFoodNameByFoodId(1, "Bryiyani");
		System.out.println("Update: "+update);
		hotel.addFoodItems();
		
		boolean delete = hotel.DeleteByFoodId(2);
		System.out.println("Deleted: "+delete);
		hotel.addFoodItems();
	}
}