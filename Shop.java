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
			if(device[i] != null){
				System.out.println(device[i].getDeviceId()+ ", "+device[i].getDeviceName()+ ", "+device[i].getDeviceColor()+ ",  "+device[i].getDevicePrice());
			}
		}
	}
	
	public boolean updateDeviceNameByDeviceId(int id, String name){
		System.out.println("Inside updateDeviceNameByDeviceId()");
		boolean isUpdated = false;
		for(int i = 0; i< device.length; i++){
			if(device[i] != null){
				if(device[i].getDeviceId() == id){
					device[i].setDeviceName(name);
					isUpdated = true;
				}
			}
		}
		return isUpdated;
	}
	
	public boolean deleteById(int id){
		System.out.println("Inside deleteById()");
		boolean isDeleted = false;
		for(int i = 0; i<device.length; i++){
			if(device[i] != null){
				if(device[i].getDeviceId() == id){
					device[i] = null;
					isDeleted = true;
				}
			}
		}
		return isDeleted;
	}

	public ElectronicDeviceDTO getDeviceDetailsById(int id) {
		System.out.println("Inside getOsDetailsByOsSize()");
		ElectronicDeviceDTO dto = null;
		for (int i = 0; i < device.length; i++) {
			if(id > 0){
				if(device[i].getDeviceId() == id){
					dto = device[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public ElectronicDeviceDTO getDeviceDetailsByName(String name) {
		System.out.println("Inside getDeviceDetailsByName()");
		ElectronicDeviceDTO dto = null;
		for (int i = 0; i < device.length; i++) {
			if(name != null){
				if(device[i].getDeviceName().equals(name)){
					dto = device[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public ElectronicDeviceDTO getDeviceDetailsByColor(String color) {
		System.out.println("Inscolore getDeviceDetailsByColor()");
		ElectronicDeviceDTO dto = null;
		for (int i = 0; i < device.length; i++) {
			if(color != null){
				if(device[i].getDeviceColor().equals(color)){
					dto = device[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public ElectronicDeviceDTO getDeviceDetailsByPrice(double price) {
		System.out.println("Inside getDeviceDetailsByPrice()");
		ElectronicDeviceDTO dto = null;
		for (int i = 0; i < device.length; i++) {
			if(price > 0){
				if(device[i].getDevicePrice() == price){
					dto = device[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public String getDeviceNameByDeviceId(int id) {
		System.out.println("Inside getDeviceNameByDeviceId()");
		String name = null;
		for (int i = 0; i < device.length; i++) {
			if(id >0){
				if(device[i].getDeviceId() == id){
					name = device[i].getDeviceName();
				}
			}else{
				System.out.println("Not found");
			}
		}
		return name;
	}
	public double getDevicePricebyDeviceId(int id){
		System.out.println("Inside getDevicePricebyDeviceId()");
		double price = 0.0;
		for (int i = 0; i < device.length; i++) {
			if(id >0){
				if(device[i].getDeviceId() == id){
					price = device[i].getDevicePrice();
				}
			}else{
				System.out.println("Not found");
			}
		}
		return price;
	}
}