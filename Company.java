class Company{
	ServiceDTO[] service;
	int index;
	
	public  Company(int size){
		service = new ServiceDTO[size];
	}
	public boolean addService(ServiceDTO service){
		boolean isAdded = false;
		System.out.println("Inside addService()");
		if(service != null){
			System.out.println("Adding service");
			this.service[index++] = service;
			isAdded = true;
		}
		else{
			System.out.println("Unable to add");
		}
		return isAdded;
	}
	public void printDetails(){
		for(int i = 0; i<service.length; i++){
			System.out.println(service[i].getServiceRegisterId()+ ", "+service[i].getServiceType());
		}
	}
}