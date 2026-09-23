package p1;

public class Circle extends Shape{
	protected double radius=1.0;

	public Circle(){}

	public Circle(double radius){
		this.radius=radius;
	}

	public Circle(double radius, String colour, boolean filled){
		super(colour,filled);
		this.radius=radius;
		
	}

	public double getRadius(){ return radius; }

	public void setRadius(double radius){
		this.radius=radius;

	}

	@Override
	public double getArea(){
		return 3.14*(radius*radius);

	}

	@Override
	public double getPerimeter(){
		return 2*3.14*radius;
	}

	@Override
	public String toString(){

		return "Colour:"+super.getColour()+"  Filled:"+super.isFilled()+"  Radius:"+radius;
	}
}
