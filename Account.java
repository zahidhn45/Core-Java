class Account{
	String name;
	int age;
	String gender;
	long phone;
	
	public Account(String name, int age, String gender, long phone){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	
	public void displayDetails(){
		System.out.println("inside displayDetails()");
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Gender: "+this.gender);
		System.out.println("Phone Number: "+this.phone);
	}
}