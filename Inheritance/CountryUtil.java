class CountryUtil{
	public static void main(String[] args){
		Country country = new India();
		
		country.setNoOfCountry(195);
		country.setTotalPopulation("775.28 crores");
		country.countryStatus();
		
		System.out.println();
		
		India india = new India();
		
		india.setName("India");
		india.setTtotalPopulationOfCountry("3 crore");
		india.setOfficialLanguage("English");
		india.setNoOfState(29);
		System.out.println("Total number of country: "+country.noOfCountry+ ", Total Population: "+country.totalPopulation+", Country Name: "+india.name+ ", Number of State: "+india.noOfState+ ", Official Language: "+india.officialLanguage+ ", Total Population: "+india.totalPopulation);
		
		
	}
}