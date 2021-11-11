class SocialMediaUtil{
	public static void main(String[] args){
		Facebook fb = new Facebook();
		fb.setName("Facebook");
		fb.setId(452);
		fb.setAccountName("ABC");
		fb.connectingPeople();
		fb.printDetail();
	}
}