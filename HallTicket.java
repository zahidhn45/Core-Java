class HallTicket{
	String usnNo;
	String subjectName;
	String candicateName;
	
	public HallTicket(String usnNo, String subjectName, String candicateName){
		this.usnNo = usnNo;
		this.subjectName = subjectName;
		this.candicateName = candicateName;
	}

	
	public void displayDetails(){
		System.out.println("Inside displayDetails()");
		System.out.println("Usn No: "+this.usnNo);
		System.out.println("Subject Name: "+this.subjectName);
		System.out.println("Candicate Name: "+this.candicateName);
	}
}