class ElectricKettleUtil{
	public static void main(String[] args){
		ElectricKettle electricKettle = new ElectricKettle("Stainless Steel", "Water Tea",  6);
		System.out.println("\nBrand: "+electricKettle.brand+ "\nPrice: "+electricKettle.price+ "\nMaterial: "+electricKettle.material+ "\nSuitable For: "+electricKettle.suitableFor+ "\nCapacity: "+electricKettle.capacityInLtr);
	}
}