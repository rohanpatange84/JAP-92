package ticketpkg;

import moviepkg.Movie;

public class TicketBooking{
	private static int bookingID;
	private static int customerID;
	private String customerName;
	private int numOfTicket;
	private Movie m;
	private int totalAmount;


	public TicketBooking(String customerName,int numOfTicket,Movie m){
		this.customerName=customerName;
		this.numOfTicket=numOfTicket;
		bookingID++;
		customerID++;
		this.m=m;

		totalAmount=numOfTicket*m.getTicketPrice();
	}

	public int getNumOfTicket(){
		return numOfTicket;
	}

	public int getTotalPrice(){
		return numOfTicket*m.getTicketPrice()-m.getDiscount();

	}

	public void getBookingDetail(){
		System.out.println("Customer ID : "+customerID);
		System.out.println("Customer Name : "+customerName);
		System.out.println("Movie Name : "+m.getTital());
		System.out.println("Number of Ticket : "+numOfTicket);
		System.out.println("Total amount :"+totalAmount);


	}
}