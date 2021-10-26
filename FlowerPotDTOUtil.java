class FlowerPotDTOUtil{
	public static void main(String[] args){
		FlowerPotDTO flowerpot = new FlowerPotDTO();
		
		flowerpot.setFlowerPotId(675);
		flowerpot.setShape("Round");
		flowerpot.setColor("White");
		flowerpot.setMaterial("Plastic");
		
		System.out.println(flowerpot.getFlowerPotId()+ ", "+flowerpot.getShape()+ ", "+flowerpot.getColor()+ ", "+flowerpot.getMaterial());
	}
}