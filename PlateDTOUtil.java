class PlateDTOUtil{
	public static void main(String[] args){
		PlateDTO plate = new PlateDTO();
		
		plate.setBrand("Sunwood Enterprise");
		plate.setColor("Brown");
		plate.setDisposal(false);
		plate.setMaterial("Wood");
		
		System.out.println(plate.getBrand()+ ", "+plate.getColor()+ ", "+plate.getDisposal()+ ", "+plate.getMaterial());
	}
}