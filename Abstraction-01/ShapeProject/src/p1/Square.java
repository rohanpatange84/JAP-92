package p1;

public class Square extends Rectangle{
	protected double side=1.0;

	public Square(){}

	public Square(double side){
		
	}

	public Square(double side, String colour, boolean filled){
		super(side,side,colour,filled);

		
	}

	public double getSide(){ return super.getWidth(); }

	public  void setSide(double side){
		super.setWidth(side);
		super.setLength(side);
	}


	@Override 
	public String toString(){
		return super.toString();
	}


	

	public void setWidth(double width){
		super.setWidth(width);
		super.setLength(width);
	}

	public void setLength(double length){
		super.setLength(length);
		super.setWidth(length);
	}
	
}