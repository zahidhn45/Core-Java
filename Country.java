class Country{
	int noOfCountry;
	String totalPopulation;
	
	public Country(){
		System.out.println("Super class Country object is created");
	}
	public void setNoOfCountry(int noOfCountry){
		this.noOfCountry = noOfCountry;
	}
	public void setTotalPopulation(String totalPopulation){
		this.totalPopulation = totalPopulation;
	}
	public void countryStatus(){
		System.out.println("");
	}
}