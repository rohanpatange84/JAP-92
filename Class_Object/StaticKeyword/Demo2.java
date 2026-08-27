class Stone{
	private int num;
	static int cnt;

	public Stone(int num){
		cnt++;
		this.num=num;

	}

	public int getNum(){
		return num;

	}


	public int getCnt(){
		return cnt;

	}
}



public class Demo2{
	public static void main(String[] args) {

		// Stone n1=null;
		// for(int i=1;i<=10;i++){
		// 	n1=new Stone(i*2);

		// }



		for(int i=1;i<=5;i++){
			Stone ni=new Stone(i*1);

		}

		Stone n11=new Stone(99);

		System.out.println(n11.getNum());

		System.out.println(n11.getCnt());




		
	}
}