public class TrimmerDTO{
	private String brand;
	private String bladeMaterial;
	private boolean waterResistance;
	private double price;
	
	public TrimmerDTO(){
		System.out.println("TrimmerDTO object was created");
	}
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	public void setBladeMaterial(String bladeMaterial){
		this.bladeMaterial = bladeMaterial;
	}
	
	public void setWaterResistance(boolean waterResistance){
		this.waterResistance = waterResistance;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public String getBladeMaterial(){
		return bladeMaterial;
	}
	
	public boolean getWaterResistance(){
		return waterResistance;
	}
	
	public double getPrice(){
		return price;
	}

	@Override
	public String toString(){
		return "Trimmer - [Brand = "+getBrand()+" Price = "+getPrice()+" Blade Material = "+getBladeMaterial()+" Water Resistance = "+getWaterResistance()+"]";
	}
}