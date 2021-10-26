class Bank{
	double rate;
	Account account;
	
	public Bank(){
		
	}
	
	public Bank(double rate){
		this.rate = rate;
	}
	
	public void rateOfIntrest(Account account){
		System.out.println("inside rateOfIntrest()");
		if(rate >= 9.5){
			if(account != null){
				this.account = account;
				account.displayDetails();
			} 
			else{
				System.out.println("Get a Account");
			}
		}
		else{
			System.out.println("Not a good bank...");
		}
	}
	
}