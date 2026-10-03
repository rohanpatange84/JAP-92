class Point{
	int x;
	int y;
	

	public Point(){ }

	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}

	
	public boolean equals(Point p){
		if(this.x==p.x && this.y==p.y)
			return true;
		else 
			return false;
	}
}


public class App{
	public static void main(String[] args) {

		Point p1=new Point(10,20);
		Point p2=new Point(10,20);

		System.out.println(p1.equals(p2));
		
	}
}