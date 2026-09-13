package p1;

public class Train extends Passanger{
	private int trainNum;
	private String trainName;
	
	public Train(){
		this(-1,"");

	}

	public Train(int trainNum, String trainName){
		this.trainNum=trainNum;
		this.trainName=trainName;
	}

	//getter 
	public int getTrainNum(){ return trainNum; }

	public String getTrainName(){ return trainName; }

	public void getTrainInfo(){
		System.out.println("Train Number: "+trainNum);
		System.out.println("Train Name: "+trainNum);
		
	}


	

}