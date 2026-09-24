package p2;

import p1.Shape;

public class Circle implements Shape{
	protected String colour="Red";
	protected boolean filled=true;

	protected double radius=1.0;

	public Circle(){}

	public Circle(double radius){
		this.radius=radius;
	}

	public Circle(double radius, String colour, boolean filled){
		this.colour=colour;
		this.filled=filled;
		this.radius=radius;
		
	}

	public double getRadius(){ return radius; }

	public void setRadius(double radius){
		this.radius=radius;

	}

	@Override
	public void setColour(String colour){
		this.colour=colour;
	}

	@Override
	public void setFilled(boolean filled){
		this.filled=filled;

	}


	@Override
	public String getColour(){ return colour;}

	@Override
	public boolean isFilled(){ return filled;}



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

		return "Colour:"+colour+"  Filled:"+filled+"  Radius:"+radius;
	}
}