class RouterUtil{
	public static void main(String[] args){
		Router router = new Router(300, "External", 2, 4);
		System.out.println("\nBrand: "+router.brand+ "\nColor: "+router.color+ "\nPrice: "+router.price+ "\nWireless Speed: "+router.wirelessSpeed+ "\nAnteena: "+router.anteena+ "\nNumber of LAN Port: "+router.lanPort+ "\nNumber of Anteena: "+router.numberOfAnteena);
	}
}