public class FoodItemDTO{
	private int foodId;
	private String foodName;
	private double foodPrice;
	private String foodType;
	
	public FoodItemDTO(int foodId, String foodName, double foodPrice, String foodType){
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodType = foodType;
	}
	
	public void setFoodId(int foodId){
		this.foodId = foodId;
	}
	public int getFoodId(){
		return foodId;
	}
	public void setFoodName(String foodName){
		this.foodName = foodName;
	}
	public String getFoodName(){
		return foodName;
	}
	public void setFoodPrice(double foodPrice){
		this.foodPrice = foodPrice;
	}
	public double getFoodPrice(){
		return foodPrice;
	}
	public void setFoodType(String foodType){
		this.foodType = foodType;
	}
	public String getFoodType(){
		return foodType;
	}
}