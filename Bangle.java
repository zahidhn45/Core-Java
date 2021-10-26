class Bangle{
	String modelName;
	String modelNumber;
	String baseMaterial;
	String color;
	
	public Bangle(String modelName, String modelNumber, String baseMaterial, String color){
		this.modelName = modelName;
		this.modelNumber =  modelNumber;
		this.baseMaterial = baseMaterial;
		this.color = color;
	}
	
	public void printValues(){
		System.out.println(modelName+" "+modelNumber+" "+baseMaterial+" "+color);
	}
	
	public static void main(String[] args){
		Bangle bangle = new Bangle("Diamond Look", "thr45kk", "Alloy", "Gold");
		bangle.printValues();
	}
}