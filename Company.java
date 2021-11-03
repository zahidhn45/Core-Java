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
			if(service[i] != null){
				System.out.println(service[i].getServiceRegisterId()+ ", "+service[i].getServiceType());
			}
		}
	}
	
	public boolean updateServiceTypeById(String type, String id){
		System.out.println("Inside updateServiceTypeById()");
		boolean isUpdated = false;
		for(int i = 0; i < service.length; i++){
			if(service[i] != null){
				if(service[i].getServiceRegisterId().equals(id)){
					service[i].setServiceType(type);
					isUpdated = true;
				}
			}
		}
		return isUpdated;
	}
	
	public boolean deleteById(String id){
		System.out.println("Inside deleteById()");
		boolean isDeleted  =  false;
		for(int i = 0; i < service.length; i++){
			if(service[i] != null){
				if(service[i].getServiceRegisterId().equals(id)){
					service[i] =  null;
					isDeleted = true;
				}
			}
		}
		return isDeleted;
	}

	public ServiceDTO getServiceDetailsById(String id) {
		System.out.println("Inside getServiceTypeById()");
		ServiceDTO dto = null;
		for (int i = 0; i < service.length; i++) {
			if(id != null){
				if(service[i].getServiceRegisterId().equals(id)){
					dto = service[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public ServiceDTO getServiceDetailsByType(String type) {
		System.out.println("Inside getServiceDetailsByType()");
		ServiceDTO dto = null;
		for (int i = 0; i < service.length; i++) {
			if(type != null){
				if(service[i].getServiceType().equals(type)){
					dto = service[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public String getServiceIdByType(String type){
		System.out.println("Inside getServiceIdByType()");
		String id = null;
		for (int i = 0; i < service.length; i++) {
			if(type != null){
				if(service[i].getServiceType().equals(type)){
					id = service[i].getServiceRegisterId();
				}
			} else{
				System.out.println("Not found");
			}
		}
		return id;
	}
	public String getServiceTypeById(String id){
		System.out.println("Inside getServiceIdByType()");
		String type = null;
		for (int i = 0; i < service.length; i++) {
			if(id != null){
				if(service[i].getServiceRegisterId().equals(id)){
					type = service[i].getServiceType();
				}
			} else{
				System.out.println("Not found");
			}
		}
		return type;
	}
}