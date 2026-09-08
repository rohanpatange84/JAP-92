package reservationpkg;

import reservationpkg.Reservation;
import roompkg.Room;

public class BookRoom{
	public static void main(String[] args) {
		Room res=new Room(1,"Double",1500);
		Reservation r1=new Reservation(1,1,"Rohan",3,1000,res);

		r1.getRoomDetails();

		r1.getTotalAmount();

		r1.getReservationDetails();
		
	}
}