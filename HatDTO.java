public class HatDTO{
	private String color;
	private double price;
	private String fabric;
	private String pattern;
	
	public HatDTO(){
		System.out.println("HatDTO object was created");
	}
	
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	
	public void  setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
	
	public void setFabric(String fabric){
		this.fabric = fabric;
	}
	public String getFabric(){
		return fabric;
	}
	
	public void setPattern(String pattern){
		this.pattern = pattern;
	}
	public String getPattern(){
		return pattern;
	}
}