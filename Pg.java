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
			System.out.println(room[i].getRoomNumber()+ ", "+room[i].getRoomType()+ ", "+room[i].getNumberOfBed()+ ", "+room[i].getCupboardAvailable());
		}
	}
}