public class RouterDTO{
	private String brand;
	private String color;
	private double price;
	private int numberOfLanPort;
	
	public RouterDTO(){
		System.out.println("RouterDTO object was created");
	}
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public void setNumberOfLanPort(int numberOfLanPort){
		this.numberOfLanPort  = numberOfLanPort;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public String getColor(){
		return color;
	}
	
	public double getPrice(){
		return  price;
	}
	
	public int getNumberOfLanPort(){
		return numberOfLanPort;
	}

	@Override
	public String toString(){
		return "Router - [Brand = "+getBrand()+" Price = "+getPrice()+" Color = "+getColor()+" Lan Port = "+getNumberOfLanPort()+"]";
	}
}