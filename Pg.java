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
}