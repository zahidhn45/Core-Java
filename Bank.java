class Bank{
	AccountDTO[] account;
	int index;
	
	public Bank(int size){
		account = new AccountDTO[size];
	}
	
	public boolean addAccount(AccountDTO account){
		boolean isAdded  =  false;
		System.out.println("Inside addAccount()");
		if(account != null){
			System.out.println("Adding account");
			this.account[index++] = account;
			isAdded = true;
		}
		else{
			System.out.println("can't add account");
		}
		return isAdded;
	}
	public void printDetails(){
		for(int i = 0; i<account.length; i++){
			System.out.println(account[i].getAccountId()+ ", "+account[i].getAccountName()+ ", "+account[i].getGender()+ ", "+account[i].getPhone()+ ", "+account[i].getRateOfIntrest());
		}
	}
}