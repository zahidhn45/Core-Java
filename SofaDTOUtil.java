class SofaDTOUtil{
	public static void main(String[] args){
		SofaDTO sofa = new SofaDTO();
		
		sofa.setMaterial("Poly Cotton");
		sofa.setFillingMaterial("Foam");
		sofa.setFrameMaterial("SOlid wood");
		sofa.setPrice(18499.00);
		
		System.out.println(sofa.getMaterial()+ ", "+sofa.getFillingMaterial()+ ", "+sofa.getFrameMaterial()+ ", "+sofa.getPrice());
	}
}