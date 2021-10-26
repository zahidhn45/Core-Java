class  Shop{
	ElectronicDeviceDTO[] device;
	int index;
	
	public Shop(int size){
		device = new ElectronicDeviceDTO[size];
	}
	public boolean addElectronicDevice(ElectronicDeviceDTO device){
		boolean isAdded = false;
		System.out.println("Inside addElectronicDevice()");
		if(device != null){
			System.out.println("Adding Electronic Device");
			this.device[index++] = device;
			isAdded = true;
		}
		else{
			System.out.println("Cannot add Device");
		}
		return isAdded;
	}
	public void printDetails(){
		for(int i =0 ; i< device.length; i++){
			System.out.println(device[i].getDeviceId()+ ", "+device[i].getDeviceName()+ ", "+device[i].getDeviceColor()+ ",  "+device[i].getDevicePrice());
		}
	}
}