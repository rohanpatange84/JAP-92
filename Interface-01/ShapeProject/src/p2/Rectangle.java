package p2;

import p1.Shape;

public class Rectangle implements Shape{
	protected String colour="Red";
	protected boolean filled=true;

	protected double width = 1.0;
	protected double length = 1.0;

	public Rectangle(){}

	public Rectangle(double width, double length){
		this.width=width;
		this.length=length;
	}

	public Rectangle(double width, double length, String colour,boolean filled){
		this.colour=colour;
		this.filled=filled;
		this.width=width;
		this.length=length;
		
	}

	

	public double getWidth(){ return width; }

	public void setWidth(double width){
		this.width=width;
	}

	public double getLength(){return length; }

	public void setLength(double length){
		this.length=length;
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
		return width*length;

	}

	@Override 
	public double getPerimeter(){
		return 2*(length+width);
	}

	@Override
	public String toString(){
		boolean res=filled;
		if(res)
		return "Colour:"+colour+"  Filled:"+"True"+"   Width:"+width+"  Length:"+length;
		else
			return "Colour:"+colour+"  Filled:"+"False"+"   Width:"+width+"  Length:"+length;
	}
}