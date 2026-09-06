import java.util.Random;
public class Theater{

	public static  void printArr(char seats[][]){
		for(char ch[]:seats){
			for(char position:ch){
				System.out.print(position+" ");
			}
			System.out.println();
		}
	}

	public static void seatNum(char seats[][]){

		Random random = new Random();
		for(int i=0;i<seats.length;i++){
			int cnt=1;

			for(int j=0;j<seats[i].length;j++){
				boolean res=random.nextBoolean();
				if(res){
					System.out.print(cnt+""+seats[i][j]+"+ ");
				    cnt++;
				}else{
					System.out.print(cnt+""+seats[i][j]+"- ");
				    cnt++;
				}
			}
			System.out.println();
				
		}
	}
	public static void main(String[] args) {
		char seats[][]=new char[][]{ {'A','A','A','A','A','A'},
						    {'B','B','B','B','B','B'},
						    {'C','C','C','C','C','C'},
						    {'D','D','D','D','D','D'},
						    {'E','E','E','E','E','E'},
						    {'F','F','F','F','F','F'}};


						    printArr(seats);

						    seatNum(seats);



	}
}