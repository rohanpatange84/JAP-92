class Point{
	int x=10;
	int y=20;

	@Override
	public  String toString(){
		return "X: "+x+" "+"Y: "+y;
	}



}
public class App{
	public static void main(String[] args) {

		Point p1= new Point();

		System.out.println(p1.toString());		
	}
}