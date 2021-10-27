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
			if(os[i] != null){
				System.out.println(os[i].getOsName()+ ", "+os[i].getOsSize()+ ", "+os[i].getGammingExperince());
			}
			
		}
	}
	public boolean updategammingByName(String name, String game){
		System.out.println("Inside updategammingByName()");
		boolean isUpdate = false;
		for(int i = 0; i < os.length; i++){
			if(os[i] != null){
				if(os[i].getOsName().equals(name)){
					os[i].setGammingExperience(game);
					isUpdate = true;
				}
			}
		}
		return isUpdate;
	}
	public boolean deleteByName(String name){
		System.out.println("Inside deleteByName()");
		boolean isDeleted = false;
		for(int i = 0; i < os.length; i++){
			if(os[i] != null){
				if(os[i].getOsName().equals(name)){
					os[i] = null;
					isDeleted = true;
				}
			}
		}
		return isDeleted;
	}
}