package ticketpkg;

import moviepkg.Movie;

public class TicketBooking{
	private static int bookingID;
	private static int customerID;
	private String customerName;
	private int numOfTicket;
	private int totalAmount=numOfTicket*Movie.getTicketPrice();


	public TicketBooking(String customerName,int numOfTicket){
		this.customerName=customerName;
		this.numOfTicket=numOfTicket;
		bookingID++;
		customerID++;
	}

	public int getNumOfTicket(){
		return numOfTicket;
	}

	public int getTotalPrice(){
		return numOfTicket*Movie.getTicketPrice()-Movie.getDiscount();

	}

	public void getBookingDetail(){
		System.out.println("Customer ID : "+customerID);
		System.out.println("Customer Name : "+customerName);
		System.out.println("Movie Name : "+Movie.getTital());
		System.out.println("Number of Ticket : "+numOfTicket);
		System.out.println("Total amount :"+totalAmount);


	}
}