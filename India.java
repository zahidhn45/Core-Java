class India extends Country{
	int noOfState;
	String totalPopulationOfCountry;
	String officialLanguage;
	String name;
	
	public India(){
		System.out.println("sub class India object is created");
	}
	
	public void setNoOfState(int noOfState){
		this.noOfState = noOfState;
	}
	public void setTtotalPopulationOfCountry(String totalPopulationOfCountry){
		this.totalPopulation = totalPopulationOfCountry;
	}
	public void setOfficialLanguage(String officialLanguage){
		this.officialLanguage = officialLanguage;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public void countryStatus(){
		System.out.println("World At peace");
	}
}