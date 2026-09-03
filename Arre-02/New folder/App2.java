import java.util.Scanner;
class Quation{
	String quation;
	int options[]=new int[4];
	private int ans;

	public Quation(String quation,int ans,int options[]){
		this.quation=quation;
		this.ans=ans;
		this.options=options;
	}

	public String getName(){
		return quation;
	}


	public void getQuation(){
		System.out.print("Q)"+quation);
		System.out.println();
		for(int i=0;i<options.length;i++){
			System.out.println("  "+(i+1)+")"+options[i]);
		}

	}

	public void getAnswer(){
		System.out.println(ans);
	}
}

public class App2{

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
		1	int ans=sc.nextInt();
			sc.nextLine();
			q1[i]=new Quation(quation,ans,getOption());

		}

		System.out.println(q1[0].getName());

		

		for(int i=0;i<q1.length;i++){
			q1[i].getQuation();

		}

		q1[i].getAnswer();

		
		
	}
}