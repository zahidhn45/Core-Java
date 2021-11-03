class Mobile{
	
	ApplicationDTO[] app;
	int index;
	
	public Mobile(int size){
		app = new ApplicationDTO[size];
	}
	
	public boolean addApplication(ApplicationDTO app){
		boolean isAdded = false;
		System.out.println("Inside addApplication()");
		if(app != null){
			System.out.println("Adding Application");
			this.app[index++]= app;
			isAdded = true;
		}
		else{
			System.out.println("Cannot Add Application");
		}
		return isAdded;
	}
	public void printDetails(){
		for(int i =  0;  i< app.length; i++){
			if(app[i] != null){
				System.out.println(app[i].getAppName()+ ",  "+app[i].getAppType()+ ",  "+app[i].getAppSize()+ ",  "+app[i].getAppRating());
			}
			
		}
	}
	
	public boolean updateAppNameByAppType(String name, String type){
		System.out.println("Inside updateAppNameByAppType");
		boolean isUpdated = false;
		for(int i = 0; i <app.length; i++){
			if(app[i] != null){
				if(app[i].getAppType().equals(type)){
					app[i].setAppName(name);
					isUpdated = true;
				}
			}
		}
		return isUpdated;
	}
	
	public boolean deleteByAppName(String name){
		System.out.println("Inside deleteByAppName()");
		boolean isDeleted = false;
		for(int i = 0; i< app.length; i++){
			if(app[i] != null){
				if(app[i].getAppName().equals(name)){
					app[i] = null;
					isDeleted = true;
				}
			}
		}
		return isDeleted;
	}
	public ApplicationDTO getAppDetailsByAppType(String type) {
		System.out.println("Inside getOsNameByOsSize()");
		ApplicationDTO dto = null;
		for (int i = 0; i < app.length; i++) {
			if(type != null){
				if(app[i].getAppType().equals(type)){
					dto = app[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public ApplicationDTO getAppDetailsByAppName(String name) {
		System.out.println("Inside getAppDetailsByAppName()");
		ApplicationDTO dto = null;
		for (int i = 0; i < app.length; i++) {
			if(name != null){
				if(app[i].getAppName().equals(name)){
					dto = app[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public ApplicationDTO getAppDetailsByAppSize(int size) {
		System.out.println("Inside getAppDetailsByAppSize()");
		ApplicationDTO dto = null;
		for (int i = 0; i < app.length; i++) {
			if(size > 0){
				if(app[i].getAppSize() == size){
					dto = app[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public ApplicationDTO getAppDetailsByAppRating(double rating) {
		System.out.println("Inside getAppDetailsByAppRating()");
		ApplicationDTO dto = null;
		for (int i = 0; i < app.length; i++) {
			if(rating > 0){
				if(app[i].getAppRating() == rating){
					dto = app[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public String getAppNameByAppType(String type){
		System.out.println("Inside getAppNameByAppType()");
		String name = null;
		for (int i = 0; i < app.length; i++) {
			if(type != null){
				if(app[i].getAppType().equals(type)){
					name = app[i].getAppName();
				}
			} else{
				System.out.println("Not found");
			}
		}
		return name;
	}
	public String getAppTypeByAppName(String name){
		System.out.println("Inside getAppTypeByAppName()");
		String type = null;
		for (int i = 0; i < app.length; i++) {
			if(name != null){
				if(app[i].getAppName().equals(name)){
					type = app[i].getAppType();
				}
			} else{
				System.out.println("Not found");
			}
		}
		return type;
	}
}