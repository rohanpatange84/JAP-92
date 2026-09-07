package p3;

public class Marks{
	private int physics;
	private int chemistry;
	private int biology;
	private int math;
	private int english;



	public Marks(int physics,int chemistry,int biology,int math,int english){
		this.physics=physics;
		this.chemistry=chemistry;
		this.biology=biology;
		this.math=math;
		this.english=english;
	}


	public int getTotal(){
		return physics+chemistry+biology+math+english;
	}
}