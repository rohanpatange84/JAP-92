package p1;

public class TV{
	private int channel;
	private int volumeLevel;
	private boolean on;

	public TV(){

	}


	public void turnOn(){
		on=true;
	}

	public void turnOff(){
		on=false;
	}

	public Boolean getStatus(){
		return on;
	}

	public void setChannel(int newChannel){
		if(on){
		channel=newChannel;
		}else{
		System.out.println("Please Turn on TV");
		}
	}

	public void setVolume(int newVolumeLevel){
		if(on){
		volumeLevel=newVolumeLevel;
	    }else{
		System.out.println("Please Turn on TV");
		}
	}

	public void channelUp(){
		if(on){
		channel++;
	    }else{
		System.out.println("Please Turn on TV");
		}
	}

	public void channelDown(){
		if(on){
		channel--;
	    }else{
		System.out.println("Please Turn on TV");
		}
	}

	public void volumeUp(){
		if(on){
		volumeLevel++;
		}else{
		System.out.println("Please Turn on TV");
		}
	}

	public void volumeDown(){
		if(on){
		volumeLevel--;
		}else{
		System.out.println("Please Turn on TV");
		}
	}


	public void getInfo(){
		System.out.println("Channel: "+channel);
		System.out.println("Volume: "+volumeLevel);
		System.out.println(on);
	}







}