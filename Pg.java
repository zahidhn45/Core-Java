class Pg{
	RoomsDTO[] room;
	int index;
	
	public Pg(int size){
		room = new RoomsDTO[size];
	}
	
	public boolean addRoom(RoomsDTO room){
		boolean isAdded = false;
		System.out.println("Inside addRoom()");
		if(room != null){
			System.out.println("Adding room");
			this.room[index++] = room;
			isAdded = true;
		}
		else{
			System.out.print("Cannot add room");
		}
		return isAdded;
	}
	public void printDetails(){
		for(int i =  0; i<room.length; i++){
			if(room[i] != null){
				System.out.println(room[i].getRoomNumber()+ ", "+room[i].getRoomType()+ ", "+room[i].getNumberOfBed()+ ", "+room[i].getCupboardAvailable());
			}
		}
	}
	public boolean updatePgTypeByPgRoomNo(int id, String type){
		System.out.println("Inside updatePgTypeByPgRoomNo");
		boolean isUpdate = false;
		for(int i = 0; i< room.length; i++){
			if(room[i] != null){
				if(room[i].getRoomNumber() == id){
					room[i].setRoomType(type);
					isUpdate = true;
				}
			}
		}
		return isUpdate;
	}
	public boolean deleteByRoomNumber(int id){
		System.out.println("Inside deleteByRoomNumber");
		boolean isDeleted = false;
		for(int i = 0; i< room.length; i++){
			if(room[i] != null){
				if(room[i].getRoomNumber() == id){
					room[i] = null;
					isDeleted = true;
				}
			}
		}
		return isDeleted;
	}

	public RoomsDTO getRoomDetailsByRoomNumber(int num) {
		System.out.println("Inside getRoomDetailsByRoomNumber()");
		RoomsDTO dto = null;
		for (int i = 0; i < room.length; i++) {
			if(num > 0){
				if(room[i].getRoomNumber() == num){
					dto = room[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public RoomsDTO getRoomDetailsByRoomType(String type) {
		System.out.println("Inside getRoomDetailsByRoomType()");
		RoomsDTO dto = null;
		for (int i = 0; i < room.length; i++) {
			if(type != null){
				if(room[i].getRoomType().equals(type)){
					dto = room[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public RoomsDTO getRoomDetailsByRoomNoOfBed(int numOfBed) {
		System.out.println("Inside getRoomDetailsByRoomType()");
		RoomsDTO dto = null;
		for (int i = 0; i < room.length; i++) {
			if(numOfBed > 0){
				if(room[i].getNumberOfBed() == numOfBed){
					dto = room[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public String getRoomTypeByRoomNumber(int roomNo) {
		System.out.println("Inside getRoomTypeByRoomNumber()");
		String roomType = null;
		for (int i = 0; i < room.length; i++) {
			if(roomNo > 0){
				if(room[i].getRoomNumber() == roomNo){
					roomType = room[i].getRoomType();
				}
			}else{
				System.out.println("Not Found");
			}
		}
		return roomType;
	}
}