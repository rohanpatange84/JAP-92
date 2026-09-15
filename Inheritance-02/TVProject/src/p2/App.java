package p2;
import java.util.Scanner;
import p1.TV;

public class App{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TV t1 = new TV();

		

		do{
			System.out.println("---------------");
			t1.getInfo();
			System.out.println("---------------");
			System.out.println("-----Enter value----");
			System.out.println("1-----Turn On TV");
			System.out.println("2-----Turn OFF TV");
			System.out.println("3-----Set channel");
			System.out.println("4-----Set Volume");
			System.out.println("5-----Channal Up");
			System.out.println("6-----Channal Down");
			System.out.println("7-----Volume Up");
			System.out.println("8-----Volume Down");
			
			int n=sc.nextInt();



			switch(n){
			case 1:
				t1.turnOn();
				break;

			case 2:
				t1.turnOff();
				break;

			case 3:
				System.out.println("Enter chanal:");
				t1.setChannel(sc.nextInt());
				break;

			case 4:
				System.out.println("Enter volume:");
				t1.setVolume(sc.nextInt());
				break;

			case 5:
				t1.channelUp();
				break;

			case 6:
				t1.channelDown();
				break;
			case 7:
				t1.volumeUp();
				break;

			case 8:
				t1.volumeDown();
				break;

			default:
				System.out.println("Invalid Input");
			}
		}while(t1.getStatus());

	}
}