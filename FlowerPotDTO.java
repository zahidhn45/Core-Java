public class FlowerPotDTO{
	private int flowerPotId;
	private String shape;
	private String color;
	private String material;
	
	public FlowerPotDTO(){
		System.out.println("Flower pot object is created");
	}
	
	public int getFlowerPotId(){
		return flowerPotId;
	}
	public void setFlowerPotId(int flowerPotId){
		this.flowerPotId = flowerPotId;
	}
	
	public String getShape(){
		return shape;
	}
	public void setShape(String shape){
		this.shape = shape;
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
}