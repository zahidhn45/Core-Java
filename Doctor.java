class Doctor{
	String name;
	int doctorId;
	String gender;
	
	public void setName(String name){
		this.name = name;
	}
	public void setDoctorId(int doctorId){
		this.doctorId = doctorId;
	}
	public void setgender(String gender){
		this.gender = gender;
	}
	public void saveLife(){
		System.out.println("Doctors saves life");
	}
}