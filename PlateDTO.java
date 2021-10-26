public class PlateDTO{
	private String brand;
	private String color;
	private boolean disposal;
	private String material;
	
	public PlateDTO(){
		System.out.println("PlateDTO object is created");
	}
	
	public void setBrand(String brand){
		this.brand = brand;
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
	
	public void setDisposal(boolean disposal){
		this.disposal = disposal;
	}
	public boolean getDisposal(){
		return  disposal;
	}
	
	public void setMaterial(String material){
		this.material = material;
	}
	public String getMaterial(){
		return material;
	}
}