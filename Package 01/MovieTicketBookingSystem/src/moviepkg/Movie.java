package moviepkg;

import ticketpkg.TicketBooking;

public class Movie{
	private int movieID=1;
	private String tital="Dhurandhar";
	private String genre="Action";
	private int ticketPrice=400;
	private int discount=100;

	
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