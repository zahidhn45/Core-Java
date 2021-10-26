class SupplimentaryExam extends Exam{
	
	public SupplimentaryExam(int fees){
		this.fees = fees;
	}
	
	@Override
	public void allow(HallTicket hallTicket){
		super.allow(hallTicket);
	}
}