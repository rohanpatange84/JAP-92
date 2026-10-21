class Point implements Cloneable{
	int x;
	int y;

	public Point(){}

	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}


	public String toString(){
		return String.format("%-3d %-3d",x,y);
	}

	@Override
	public Point clone()throws CloneNotSupportedException{
		return (Point)super.clone();
	}

}



public class Example02 {
	public static void main(String[] args) throws CloneNotSupportedException{

		Point p1 = new Point(11,22);
		Point p2 =null;

		try{	
			p2= p1.clone();
		}catch(CloneNotSupportedException e){
			System.out.println("Exception occurs");
		}

		System.out.println(p1);
		System.out.println(p2);
	}
}