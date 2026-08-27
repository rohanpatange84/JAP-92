import java.util.Scanner;
public class App{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int hour;
		int minute;
		int second;


		Time t1=new Time();
		do{
			
		t1.setStatus(true);
		System.out.println("-----------------------------");
		System.out.println("Hour:"+t1.getHour()+" Minute:"+t1.getMinute()+" Second:"+t1.getSecond());
		System.out.println("Enter 1----Set time");
		System.out.println("Enter 2----Set hour");
		System.out.println("Enter 3----Set minute");
		System.out.println("Enter 4----Set second");
		System.out.println("Enter 5----get hour");
		System.out.println("Enter 6----get minut");
		System.out.println("Enter 7----get second");
		System.out.println("Enter 8----Shut down");
		System.out.print("Enter value : ");
		n=sc.nextInt();

		switch(n){



				case 1:
					System.out.print("Enter hour:");
					hour=sc.nextInt();
					System.out.print("Enter minute:");
					minute=sc.nextInt();
					System.out.print("Enter second:");
					second=sc.nextInt();

					t1.setTime(hour,minute,second);

					break;

				case 2:
					System.out.print("Enter hour:");
					hour=sc.nextInt();

					t1.setHour(hour);
					break;

				case 3:
					System.out.print("Enter minute:");
					minute=sc.nextInt();
					
					t1.setMinute(minute);
					break;

				case 4:
					System.out.print("Enter second:");
					second=sc.nextInt();
					
					t1.setSecond(second);
					break;

				case 5:
					System.out.println("Hour : "+t1.getHour());
					break;

				case 6:
					System.out.println("Minute : "+t1.getMinute());
					break;

				case 7:
					System.out.println("Second : "+t1.getSecond());
					break;	

				case 8:
					t1.setStatus(false);
					break;

				default:
					System.out.println("Invalid input");
					break;
		}

     	}while(t1.getStatus());
		

	}
}