class PaniPuri extends Chat{
	String shape;
	
	public void setShape(String shape){
		this.shape = shape;
	}
	
	public void printDetails(){
		System.out.println("Name: "+name+ ", MOstly Found: "+mostlyFound+ ", Shape: "+shape);
	}
}