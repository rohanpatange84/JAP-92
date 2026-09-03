import java.util.Scanner;
public class Team{
	private static int teamId;
	String teamName;
	String players[]=new String[11];
	int runs[]=new int[11];

public Team(String teamName){
	this.teamName=teamName;
	teamId++;

}

public void setTeam(String teamName){
	this.teamName=teamName;


}

public String getTeamName(){
	return this.teamName;
}

public void setPlayer(String players[]){
	for(int i=0;i<players.length;i++){
		this.players[i]=players[i];
	}
}

public void setRuns(int runs[]){
	for(int i=0;i<runs.length;i++){
		this.runs[i]=runs[i];
	}

}


public int getScore(){
	int sum=0;
	for(int i=0;i<this.runs.length;i++){
		sum=sum+runs[i];

	}
	// System.out.println("Team name:"++"Total Score :"+sum);
	return sum;
}


public void getPlayers(){
	System.out.println("All Players:");
	for(int i=0;i<this.players.length;i++){
		System.out.println(players[i]);
	}
}

public  void setPlayerRuns(){
	Scanner sc =new Scanner(System.in);
	for(int i=0;i<runs.length;i++){
		System.out.print("Enter run of"+this.players[i]+":");
		int run=sc.nextInt();
		runs[i]=run;
	}

}



}