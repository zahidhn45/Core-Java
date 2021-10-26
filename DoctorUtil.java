class DoctorUtil{
	public static void main(String[] args){
		Surgeon sergeon = new Surgeon();
		sergeon.setName("Mukesh");
		sergeon.setDoctorId(21365);
		sergeon.setGender("Male");
		sergeon.setWorkType("Sergeon");
		sergeon.saveLife();
		sergeon.work();
		sergeon.printDetails();
	}
}