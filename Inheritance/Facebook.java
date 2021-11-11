class Facebook extends SocialMedia{
	int id;
	String accountName;
	
	public void setId(int id){
		this.id = id;
	}
	public void setAccountName(String accountName){
		this.accountName = accountName;
	}
	public void printDetail(){
		System.out.println("Name: "+name+ ", Id: "+id+ ", Account Name: "+accountName);
	}
}