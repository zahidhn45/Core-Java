class ApplicationDTO{
	String appName;
	String appType;
	int appSize;
	double appRating;
	
	public void setAppName(String appName){
		this.appName = appName;
	}
	public String getAppName(){
		return appName;
	}
	public void setAppType(String appType){
		this.appType = appType;
	}
	public String getAppType(){
		return appType;
	}
	public void setAppSize(int appSize){
		this.appSize = appSize;
	}
	public int getAppSize(){
		return appSize;
	}
	public void setAppRating(double appRating){
		this.appRating = appRating;
	}
	public double getAppRating(){
		return appRating;
	}
}