package reservationpkg;

import roompkg.Room;


public class Reservation{
	private int reservationId;
	private int customerId;
	private String customerName;
	private int numOfNight;
	private int totalPayAmount;
	private Room room;



	public Reservation(int reservationId,int customerId,String customerName,int numOfNight,int totalPayAmount,Room room){
		this.reservationId=reservationId;
		this.customerId=customerId;
		this.customerName=customerName;
		this.numOfNight=numOfNight;
		this.totalPayAmount=totalPayAmount;
		this.room=room;
	} 

	public void getRoomDetails(){
		System.out.println("Room num: "+room.getRoomNum());
		System.out.println("Room type: "+room.getType());
		System.out.println("Room rate: "+room.getRate());
		System.out.println("Discout: "+room.getDiscount());


	}

	public void getReservationDetails(){
		System.out.println("Reservation Id : "+reservationId);
		System.out.println("Customer Id : "+customerId);
		System.out.println("Customer name : "+customerName);
		System.out.println("Num of night : "+numOfNight);





	}

	public void getTotalAmount(){
		System.out.print("Total Amount:");
		System.out.print((room.getRate()*numOfNight)-room.getDiscount());
		System.out.println();
	}




}