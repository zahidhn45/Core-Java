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
			if(account[i] != null){
				System.out.println(account[i].getAccountId()+ ", "+account[i].getAccountName()+ ", "+account[i].getGender()+ ", "+account[i].getPhone()+ ", "+account[i].getRateOfIntrest());
			}
		}
	}
	
	public boolean updateAccountNameByAccountId(String name, int id){
		System.out.println("Inside updateAccountNameByAccountId()");
		boolean isUpdated =  false;
		for(int i = 0; i<account.length; i++){
			if(account[i] != null){
				if(account[i].getAccountId() == id){
					account[i].setAccountName(name);;
					isUpdated = true;
				}
				else{
					System.out.println("No such record found");
				}
			}
			else{
				System.out.println("Account not found");
			}
		}
		return isUpdated;
	}
	
	public boolean deleteById(int id){
		System.out.println("Inside deleteById()");
		boolean isDeleted = false;
		for(int i = 0; i< account.length; i++){
			if(account[i] != null){
				if(account[i].getAccountId() == id){
					account[i] = null;
					isDeleted = true;
				}
			}
		}
		return isDeleted;
	}
}