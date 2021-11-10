class HeadPhoneDTOUtil{
	public static void main(String[] args){
		HeadPhoneDTO headphone = new HeadPhoneDTO();
		headphone.setBrand("Boat");
		headphone.setFeatures("Wireless");
		headphone.setColor("Black");
		headphone.setPrice(998.00);
		
		System.out.println(headphone.getBrand()+ ",  "+headphone.getFeatures()+ ", "+headphone.getColor()+ ", "+headphone.getPrice());
		System.out.println(headphone);
	}
}