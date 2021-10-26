class Exam{
	int fees;
	HallTicket hallTicket;
	
	public Exam(){
		
	}
	
	public Exam(int fees){
		this.fees = fees;
	}
	
	public void allow(HallTicket hallTicket){
		System.out.println("Inside Allow()");
		if (fees >= 1200){
			if (hallTicket != null){
				this.hallTicket = hallTicket;
				hallTicket.displayDetails();
				System.out.println("Allowed to write the exam... All the best");
			}
			else{
				System.out.println("No HallTicket found...Not allow to write  the exam");
			}
		}
		else{
			System.out.println("pay the fees first..!");
		}
	}
}