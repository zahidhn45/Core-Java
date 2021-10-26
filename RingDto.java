public class RingDto{
	private String brand;
	private String color;
	private String material;
	private int size;
	
	public RingDto(){
		System.out.println("RingDTO object is created");
	}
	
	public String getBrand(){
		return brand;
	}
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String getMaterial(){
		return material;
	}
	
	public void setMaterial(String material){
		this.material = material;
	}
	
	public int getSize(){
		return size;
	}
	
	public void setSize(int size){
		this.size = size;
	}
}