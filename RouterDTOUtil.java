class RouterDTOUtil{
	public static void main(String[] args){
		RouterDTO router = new RouterDTO();
		router.setBrand("D-Link");
		router.setColor("Black");
		router.setPrice(1020.00);
		router.setNumberOfLanPort(2);
		
		System.out.println(router.getBrand()+ ", "+router.getColor()+ ", "+router.getPrice()+ ", "+router.getNumberOfLanPort());
		System.out.println(router);
	}
}