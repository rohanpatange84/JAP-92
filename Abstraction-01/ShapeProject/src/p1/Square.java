package p1;

public class Square extends Rectangle{
	protected double side=1.0;

	public Square(){}

	public Square(double side){
		this.side=side;
	}

	public Square(double side, String colour, boolean filled){
		super(colour,filled);
		this.side=side;
		
	}

	public double getSide(){ return side; }

	public  void getSide(double side){
		this.side=side;
	}

	public void setWidth(double width){
		super.setWidth(width);
	}

	public void setLength(double length){
		super.setLength(length);
	}

	@Override 
	public String toString(){
		return super.toString();
	}
}