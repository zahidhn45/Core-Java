class Surgeon extends Doctor{
	string workType;
	
	public void setWorkType(String workType){
		this.workType = workType;
	}
	public void work(){
		System.out.printlnn("Works as a sergeon1;")
	}
	public void printDetails(){
		System.out.println(name+ ", "+ doctorId+ ", "+gender+ ", "+workType);
	}
}