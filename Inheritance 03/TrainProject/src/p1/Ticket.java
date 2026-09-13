package p1;

public class Ticket extends Train{
	private String coach;
	private String seatNum;


	public Ticket(){
		this("","");
	}

	public Ticket(String coach, String seatNum){
		this.coach=coach;
		this.seatNum=seatNum;
	}

	//
	public String getCoach(){
		return coach;

	}

	public String getSectNum(){
		return seatNum;
	}

	public void getTicketInfo(){
		super.getPassager();
		super.getTrainInfo();
		System.out.println("Coach: "+coach);
		System.out.println("Seat Number: "+seatNum);
	}


}