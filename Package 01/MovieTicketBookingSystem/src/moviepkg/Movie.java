package moviepkg;

import ticketpkg.TicketBooking;

public class Movie{
	private int movieID;
	private String tital;
	private String genre;
	private int ticketPrice;
	private int discount;

	{
		movieID=1;
		tital="Dhurandhar";
		genre="Action";
		ticketPrice=400;
		discount=100;
	}

	// public int getTotalPrice(){
	// 	return ticketPrice*TicketBooking.getNumOfTicket()+discount;

	// }

	public String getTital(){
		return tital;
	}


	public int getTicketPrice(){
		return ticketPrice;
	}


	public int getDiscount(){
		return discount;
	}



}