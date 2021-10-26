class RingDTOUtil{
	public static void main(String[] args){
		RingDto ring = new RingDto();
		
		ring.setBrand("Yellow chimes");
		ring.setColor("Red & grey");
		ring.setMaterial("Crystal");
		ring.setSize(18);
		
		System.out.println(ring.getBrand()+ ", "+ring.getColor()+ ", "+ring.getMaterial()+ ", "+ring.getSize());
	}
}