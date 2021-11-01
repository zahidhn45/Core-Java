public class AccountDTO{
	int accountId;
	String accountName;
	String gender;
	long phone;
	double rateOfIntrest;
	
	public void setAccountId(int accountId){
		this.accountId  = accountId;
	}
	public int getAccountId(){
		return accountId;
	}
	public void setAccountName(String accountName){
		this.accountName = accountName;
	}
	public String getAccountName(){
		return accountName;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return gender;
	}
	public void setPhone(long phone){
		this.phone = phone;
	}
	public long getPhone(){
		return phone;
	}
	public void setRateOfIntrest(double rateOfIntrest){
		this.rateOfIntrest = rateOfIntrest;
	}
	public double getRateOfIntrest(){
		return rateOfIntrest;
	}
}