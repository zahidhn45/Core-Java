public class CupDTO{
	private String color;
	private boolean scratchResistance;
	private String capacity;
	
	public CupDTO(){
		System.out.println("CupDTO object is created");
	}
	
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color =  color;
	}
	
	public boolean getScratchResistance(){
		return scratchResistance;
	}
	public void setScratchResistance(boolean scratchResistance){
		this.scratchResistance = scratchResistance;
	}
	
	public String getCapacity(){
		return capacity;
	}
	public void setCapacity(String capacity){
		this.capacity = capacity;
	}
	@Override
	public String toString(){
		return "Cup - [Color = "+getColor()+" Capacity = "+getCapacity()+" Scratch Resistance = "+getScratchResistance()+"]";
	}
}