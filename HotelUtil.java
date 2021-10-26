import java.util.Scanner;
class HotelUtil{
	public static void main(String[] args){
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		Hotel hotel = new Hotel(1);
		FoodItemsDTO food = new FoodItemsDTO();
		food.setFoodId(1);
		food.setFoodName("Pasta");
		food.setFoodPrice(106.20);
		food.setFoodType("Chinese");
		
		hotel.addFoodItems(food);
		hotel.getFoodItems();
	}
}