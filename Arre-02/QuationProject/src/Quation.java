public class Quation{
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


	public void (){
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
