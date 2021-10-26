class TrimmerUtil{
	public static void main(String[] args){
		Trimmer trimmer = new Trimmer(true, true, 60);
		System.out.println(trimmer.brand+ ", "+trimmer.modelNumber+ ", "+trimmer.bladeMaterial+ ", "+trimmer.waterResistance+ ", "+trimmer.washableHead+ ", "+trimmer.runTimeInMin);
		
	}
}