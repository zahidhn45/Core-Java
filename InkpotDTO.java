public class InkpotDTO{
	private int inkpotId;
	private String color;
	private double price;
	private String madeOf;
	
	public InkpotDTO(){
		System.out.println("InkpotDTO object is created");
	}
	
	public void setInkpotId(int inkpotId){
		this.inkpotId = inkpotId;
	}
	public int getInkpotId(){
		return inkpotId;
	}
	
	public void setColor(String color){
		this.color = color;
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
	
	public void setMadeOf(String madeOf){
		this.madeOf = madeOf;
	}
	public String getMadeOf(){
		return madeOf;
	}

	@Override
	public  int hashCode(){
		return getInkpotId();
	}
	@Override
	public String toString(){
		return "Inkpot - [Id = "+getInkpotId()+" Price = "+getPrice()+" Color = "+getColor()+" Made of = "+getMadeOf()+"]";
	}
}