class PowerBank{
	String brand;
	int numberOfOutput;
	String suitableFor;
	boolean cableIncluded;
	int powerSupplyInVolt;
	
	public PowerBank(String brand, int numberOfOutput, String suitableFor, boolean cableIncluded, int powerSupplyInVolt){
		this.brand = brand;
		this.numberOfOutput = numberOfOutput;
		this.suitableFor = suitableFor;
		this.cableIncluded = cableIncluded;
		this.powerSupplyInVolt = powerSupplyInVolt;
	}
	
	public void printValues(){
		System.out.println(brand+ ", "+numberOfOutput+ ", "+suitableFor+ ", "+cableIncluded+ ", "+powerSupplyInVolt);
	}
	
	public static void main(String[] args){
		PowerBank powerBank = new PowerBank("Syska",  2, "Mobile", true, 5);
		powerBank.printValues();
	}
}