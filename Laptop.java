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

	public OsDTO getOsDetailsByOsSize(int size) {
		System.out.println("Inside getOsNameByOsSize()");
		OsDTO dto = null;
		for (int i = 0; i < os.length; i++) {
			if(size > 0){
				if(os[i].getOsSize() == size){
					dto = os[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public OsDTO getOsDetailsByOsName(String name) {
		System.out.println("Inside getOsDetailsByOsName()");
		OsDTO dto = null;
		for (int i = 0; i < os.length; i++) {
			if(name != null){
				if(os[i].getOsName().equals(name)){
					dto = os[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public OsDTO getOsDetailsByOsGamming(String exp) {
		System.out.println("Inside getOsDetailsByOsGamming()");
		OsDTO dto = null;
		for (int i = 0; i < os.length; i++) {
			if(exp != null){
				if(os[i].getGammingExperince().equals(exp)){
					dto = os[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
	public String getOsNameByOsSize(int size){
		System.out.println("Inside getOsNameByOsSize()");
		String name = null;
		for (int i = 0; i < os.length; i++) {
			if(size > 0){
				if(os[i].getOsSize() == size){
					name = os[i].getOsName();
				}
			} else{
				System.out.println("Not Found");
			}
		}
		return name;
	}
	public int getOsSizeByOsName(String name){
		System.out.println("Inside getOsNameByOsname()");
		int size = 0;
		for (int i = 0; i < os.length; i++) {
			if(name != null){
				if(os[i].getOsName().equals(name)){
					size = os[i].getOsSize();
				}
			} else{
				System.out.println("Not Found");
			}
		}
		return size;
	}
}