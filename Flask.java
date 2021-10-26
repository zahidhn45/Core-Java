class Flask{
	String brand;
	String material;
	boolean leakProof;
	String modelName;
	
	public Flask(String brand, String material, boolean leakProof, String modelName){
		this.brand =  brand;
		this.material = material;
		this.leakProof = leakProof;
		this.modelName = modelName;
	}
	
	public void printValues(){
		System.out.println(brand+ ", "+material+ ",  "+leakProof+ ", "+modelName);
	}
	
	public static void main(String[] args){
		Flask flask = new Flask("Milton", "Steel", true, "gth45kkjo1");
		flask.printValues();
	}
}