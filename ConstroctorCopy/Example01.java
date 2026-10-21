class Point{
	int x;
	int y;

	public Point(){}

	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}

	public Point(Point other){
		this.x = other.x;
		this.y = other.y;
	}

	public String toString(){
		return String.format("%-3d %-3d",x,y);
	}

}

public class Example01{
	public static void main(String[] args) {
		
		Point p1 = new Point(11,22);
		Point p2 = new Point(p1);

		System.out.println(p1.toString());
		System.out.println(p2.toString());

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

	}
}