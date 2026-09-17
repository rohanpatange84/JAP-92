class Ticket{
	public void bookTicket(){
		System.out.println("Ticket class");
	}
}

class Redbus extends Ticket{
	public void bookTicket(){
		System.out.println("Redbus class");
	}
}

class MakeMyTrip extends Ticket{
	public void bookTicket(){
		System.out.println("MakeMyTrip class");
	}

}

class BookMyBus extends Ticket{
	public void bookTicket(){
		System.out.println("Ticket class");
	}
}


public class App3{

	public static void book(Ticket t1[]){
		for(Ticket tic:t1){
			tic.bookTicket();
		}
	}
	public static void main(String[] args) {

		Ticket t1[]= new Ticket[]{new Redbus(),new MakeMyTrip(),new BookMyBus()};

		book(t1);


		
	}
}