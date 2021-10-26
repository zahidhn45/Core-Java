public class SofaDTO{
	private String material;
	private String fillingMaterial;
	private String frameMaterial;
	private double price;
	
	public SofaDTO(){
		System.out.println("SofaDTO  object is created");
	}
	
	public void setMaterial(String material){
		this.material = material;
	}
	public String getMaterial(){
		return material;
	}
	
	public void setFillingMaterial(String fillingMaterial){
		this.fillingMaterial = fillingMaterial;
	}
	public String getFillingMaterial(){
		return fillingMaterial;
	}
	
	public void setFrameMaterial(String frameMaterial){
		this.frameMaterial = frameMaterial;
	}
	public String getFrameMaterial(){
		return frameMaterial;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
}