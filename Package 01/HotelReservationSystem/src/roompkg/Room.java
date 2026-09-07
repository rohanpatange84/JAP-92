package roompkg;

public class Room{
	private int roomNum;
	private String type;
	private int rate;
	private static int discout=500;


	public Room(int roomNum,String type,int rate){
		this.roomNum=roomNum;
		this.type=type;
		this.rate=rate;

	}

	public int getRoomNum(){
		return roomNum;
	}

	public String getType(){
		return type;
	}
	public int getRate(){
		return rate;
	}
	public int getDiscount(){
		return discout;
	}
}