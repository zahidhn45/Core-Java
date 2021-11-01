public class RoomsDTO{
	int roomNo;
	String roomType;
	int numberOfBed;
	boolean cupboadAvailable;
	
	public void setRoomNumber(int roomNo){
		this.roomNo =  roomNo;
	}
	public int getRoomNumber(){
		return roomNo;
	}
	public void setRoomType(String roomType){
		this.roomType = roomType;
	}
	public String getRoomType(){
		return roomType;
	}
	
	public void setNumberOfBed(int numberOfBed){
		this.numberOfBed = numberOfBed;
	}
	public int getNumberOfBed(){
		return numberOfBed;
	} 
	public void setCupboardAvailable(boolean cupboadAvailable){
		this.cupboadAvailable = cupboadAvailable;
	}
	public boolean getCupboardAvailable(){
		return cupboadAvailable;
	}
}