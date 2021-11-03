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
	public AccountDTO getAccountDetailsByAccountId(int id){
		System.out.println("inside  getFoodItemByFoodId");
		   AccountDTO dto = null;
		  for(int i = 0 ; i < account.length ; i++){
			if(id  > 0 ){
				if( account[i].getAccountId() == id){
					dto = account[i];
				}
			}else {
				System.out.println("id with " + id +  "   is not available");
			}
	 	}
	    return dto ; 
	}
	public AccountDTO getAccountDetailsByAccountName(String name) {
		System.out.println("Inside getAccountDetailsByAccountName() ");
		AccountDTO dto = null;
		for (int i = 0; i < account.length; i++) {
			if(name != null){
				if(account[i].getAccountName().equals(name)){
					dto = account[i];
				}
			} else{
				System.out.println("Not found");
			}
		}
		return dto;
	}
	public AccountDTO getAccountDetailsByAccountRate(double rate) {
		System.out.println("Inside getAccountDetailsByAccountRate() ");
		AccountDTO dto = null;
		for (int i = 0; i < account.length; i++) {
			if(rate > 0){
				if(account[i].getRateOfIntrest() == rate){
					dto = account[i];
				}
			} else{
				System.out.println("Not found");
			}
		}
		return dto;
	}
	public String getAccountNameById(int id) {
		System.out.println("Inside getAccountNameById()");
		String name = null;
		for (int i = 0; i < account.length; i++) {
			if(id > 0){
				if(account[i].getAccountId() == id){
					name = account[i].getAccountName();
				}
			} else{
				System.out.println("Not found");
			}
		}
		return name;
	}
	public long getAccountPhoneById(int id) {
		System.out.println("Inside getAccountPhoneById()");
		long phone = 0l;
		for (int i = 0; i < account.length; i++) {
			if(id > 0){
				if(account[i].getAccountId() == id){
					phone = account[i].getPhone();
				}
			} else{
				System.out.println("Not found");
			}
		}
		return phone;
	}
	public double getAccountRateOfIntrestById(int id) {
		System.out.println("Inside getAccountRateOfIntrestById()");
		double rate = 0.0;
		for (int i = 0; i < account.length; i++) {
			if(id > 0){
				if(account[i].getAccountId() == id){
					rate = account[i].getRateOfIntrest();
				}
			} else{
				System.out.println("Not found");
			}
		}
		return rate;
	}

}