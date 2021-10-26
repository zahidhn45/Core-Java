class Laptop{
	OsDTO[]  os;
	int index;
	
	public Laptop(int size){
		os = new OsDTO[size];
	}
	
	public boolean addOs(OsDTO  os){
		boolean isAdded =  false;
		System.out.println("Inside addOs()");
		if(os != null){
			System.out.println("Adding os");
			this.os[index++] = os;
			isAdded = true;
		}
		else{
			System.out.println("Cannot Add OS");
		}
		return  isAdded;
	}
	public void printDetails(){
		for(int i = 0; i<os.length; i++){
			System.out.println(os[i].getOsName()+ ", "+os[i].getOsSize()+ ", "+os[i].getGammingExperince());
		}
	}
}