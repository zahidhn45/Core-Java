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
			System.out.println(app[i].getAppName()+ ",  "+app[i].getAppType()+ ",  "+app[i].getAppSize()+ ",  "+app[i].getAppRating());
		}
	}
}