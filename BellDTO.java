public class BellDTO{
	private String brand;
	private String color;
	private String material;
	private boolean weatherProof;
	
	public BellDTO(String brand, String color, String material, boolean weatherProof){
		System.out.println("BellDTO object is created");
		this.brand = brand;
		this.color = color;
		this.material = material;
		this.weatherProof = weatherProof;
	}
	public BellDTO(){}
	

	
	public void setBrand(String brand){
		this.brand =  brand;
	}
	public String getBrand(){
		return brand;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	
	public void setMaterial(String material){
		this.material = material;
	}
	public String getMaterial(){
		return material;
	}
	
	public void setWeatherProof(boolean weatherProof){
		this.weatherProof = weatherProof;
	}
	public boolean getWeatherProof(){
		return weatherProof;
	}

	@Override
	public String toString(){
		return "Bell - [ Brand = "+getBrand()+" Color = "+getColor()+" Material = "+getMaterial()+" WeatherProof = "+getWeatherProof()+"]";
	}
}