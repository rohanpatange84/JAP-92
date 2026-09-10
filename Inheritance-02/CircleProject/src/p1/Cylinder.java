package p1;

public class Cylinder extends Circle{
	private double height=1.0;


	public Cylinder(){

	}
	public Cylinder(double radius){

		super.setRadius(radius);

	}
	public Cylinder(double radius,double height){
	super.setRadius(radius);
	this.height=height;
	}

	public Cylinder(double radius,double height,String colour){
	setRadius(radius);
	this.height=height;
	setColour(colour);
	}

	public  double getHeight(){
		return height;
	}

	public void setHeight(double height){
		this.height=height;
	}

	public double getVolume(){
		double volume=3.14*(getRadius()*getRadius())*height;

		return volume;

	}

}