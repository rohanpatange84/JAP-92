class Point{
	final int x;
	final int y;

	public Point(){
		x=0;
		y=0;
	}

	public Point(int x,int y){
		this.x=x;
		this.y=y;

	}
}


public class App4{
	public static void main(String[] args) {

		Point p1 = new Point();

		Point p2 = new Point(10,20);

		System.out.println(p1.x+" "+p1.y);
		System.out.println(p2.x+" "+p2.y);

		//p1.x=12;  //error: cannot assign a value to final variable x

		//p2.y=20; //error: cannot assign a value to final variable x

		
	}
}