package ticketpkg;
import java.util.Scanner;
import ticketpkg.TicketBooking;
import moviepkg.Movie;

public class BookTicket{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		TicketBooking t1=new TicketBooking("Rohan",6);
		Movie m1=new Movie();


		int total=t1.getTotalPrice();

		System.out.println("Get total price: "+total);

		t1.getBookingDetail();



		
	}
}