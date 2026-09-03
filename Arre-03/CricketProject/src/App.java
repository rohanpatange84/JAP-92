import java.util.Scanner;
public class App{

	public static String[] setPlayer(){
	Scanner sc =new Scanner(System.in);
	String players[]=new String[11];
	for(int i=0;i<players.length;i++){
		System.out.print("Enter players:");
		String play=sc.nextLine();
		players[i]=play;
	}

	return players;
}

public static int[] setRuns(){
	Scanner sc =new Scanner(System.in);
	int runs[]=new int[11];
	for(int i=0;i<runs.length;i++){
		System.out.print("Enter run:");
		int run=sc.nextInt();
		runs[i]=run;
	}

	return runs;
}


public static Team[] getStatic(Team t[]){

	int sum=0;
	for(int i=0;i<5;i++){
		sum=sum+t[i].getScore();
		System.out.println("Total Score of"+t[i].getTeamName()+" : "+t[i].getScore());
	}
	System.out.println("Total teams Score:"+sum);
	return t;
}




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Team t[]=new Team[5];

		for(int i=0;i<t.length;i++){
			System.out.print("Enter team name:");
			String teamName=sc.nextLine();
			t[i]=new Team(teamName);
		}


		// t[0].setPlayer(setPlayer());

		// t[0].getPlayers();

		// t[0].setRuns(setRuns());

		t[0].getScore();

		t[0].setPlayerRuns();
		System.out.println("----------");
		t[1].setPlayerRuns();


		// t[0].getScore();

	

		getStatic(t);

		


	}
}