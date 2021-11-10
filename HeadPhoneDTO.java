public class HeadPhoneDTO{
	private String brand;
	private String features;
	private String color;
	private double price;
	
	public HeadPhoneDTO(){
		System.out.println("HeadphoneDTO object was created");
	}
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public void setFeatures(String features){
		this.features = features;
	}
	
	public String getFeatures(){
		return features;
	}
	
	public void setColor(String color){
		this.color =  color;
	}
	public String getColor(){
		return color;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
	@Override
	public String toString(){
		return "Headphone - [Brand = "+getBrand()+" Price = "+getPrice()+" Features = "+getFeatures()+" Color = "+getColor()+"]";
	}
}