public class ElectronicDeviceDTO{
	int deviceId;
	String deviceName;
	String deviceColor;
	double devicePrice;
	
	public void setDeviceId(int deviceId){
		this.deviceId = deviceId;
	}
	public int getDeviceId(){
		return deviceId;
	}
	public void setDeviceName(String deviceName){
		this.deviceName = deviceName;
	}
	public String getDeviceName(){
		return deviceName;
	}
	public void setDeviceColor(String deviceColor){
		this.deviceColor = deviceColor;
	}
	public String getDeviceColor(){
		return deviceColor;
	}
	public void setDevicePrice(double devicePrice){
		this.devicePrice = devicePrice;
	}
	public double getDevicePrice(){
		return devicePrice;
	}
}