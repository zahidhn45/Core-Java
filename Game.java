class Game{
	String name;
	String type;
	
	public Game(){
		System.out.println("Super class Game object is created");
	}
	public void setName(String name){
		this.name = name;
	}
	public void setType(String type){
		this.type = type;
	}
	public void play(){
		System.out.println("Playing");
	}
}