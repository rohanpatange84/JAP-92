import java.util.Scanner;
public class App{

	public static int[] getOption(){
		Scanner sc = new Scanner(System.in);
		int options[]=new int[4];
		for(int i=0;i<options.length;i++){
			System.out.print("Enter option:");
			int op=sc.nextInt();
			options[i]=op;

		}
		return options;
	}
	public static void main(String[] args) {

		Quation q1[]=new Quation[3];
		Scanner sc = new Scanner(System.in);



		for(int i=0;i<q1.length;i++){
			System.out.print("Enter quation: ");
			String quation=sc.nextLine();
			System.out.print("Enter answer:");
			int ans=sc.nextInt();
			sc.nextLine();
			q1[i]=new Quation(quation,ans,getOption());

		}

		System.out.println(q1[0].getName());

		

		for(int i=0;i<q1.length;i++){
			q1[i].getQuation();

		}

		// q1[0].getAnswer();

		
		
	}
}