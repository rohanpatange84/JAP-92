package ticketpkg;
import java.util.Scanner;
import ticketpkg.TicketBooking;
import moviepkg.Movie;

public class BookTicket{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);


		
		Movie m1=new Movie();
		TicketBooking t1=new TicketBooking("Rohan",6,m1);
		


		int total=t1.getTotalPrice();

		System.out.println("Get total price: "+total);

		t1.getBookingDetail();



		
	}
}