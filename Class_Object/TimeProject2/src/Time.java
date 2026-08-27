public class Time{
	private int hour;
	private int minute;
	private int second;
	private boolean status;


	//Constructor
	public Time(){


	}

	public Time(int hour,int minute,int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;

	}


	//getter
	public int getHour(){
		return hour;

	}

	public int getMinute(){
		return minute;

	}

	public int getSecond(){
		return second;

	}


	//setter
	public void setHour(int hour){
		if(hour<=23&&hour>=1)
			this.hour=hour;
		else
			System.out.println("Invalid hour");


	}

	public void setMinute(int minute){
		if(minute<=59&&minute>=1)
			this.minute=minute;
		else
			System.out.println("Invalid minute");

	}

	public void setSecond(int second){
		if(second<=59&&second>=1)
			this.second=second;
		else
			System.out.println("Invalid second");
	}

	public void setTime(int hour,int minute,int second){
		if(hour<=23&&hour>=1)
			this.hour=hour;
		else
			System.out.println("Invalid hour");

		if(minute<=59&&minute>=1)
			this.minute=minute;
		else
			System.out.println("Invalid minute");

		if(second<=59&&second>=1)
			this.second=second;
		else
			System.out.println("Invalid second");

	}

	//status
	public void setStatus(boolean status){
		this.status=status;
	}

	public boolean getStatus(){
		return status;
	}




}