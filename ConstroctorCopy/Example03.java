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
public class Example03{
	public static void main(String[] args) throws CloneNotSupportedException{

		Point p1 = new Point(99,88);
		Point p2 =null;
	
		p2= p1.clone();

		Point p3 = p2.clone();

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		System.out.println("-------------------");

		System.out.println(p3);
		System.out.println(p3.hashCode());


	}
}