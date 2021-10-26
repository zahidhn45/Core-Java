class ExamUtil{
	public static void main(String[] args){
		Exam exam = new Exam(1200);
		
		HallTicket hallTicket = new HallTicket("4I16CS041", "PTW", "ZAHID");
		exam.allow(hallTicket);
		
		Exam exam = new SupplimentaryExam(1200);
		exam.allow(hallTicket);    
	}
}