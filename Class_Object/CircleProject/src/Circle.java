public class Circle{
	private double radius;
	private String colour;

	public Circle(){
		radius=1.0;
		colour="red";
    }

	public Circle(double radius){
		this.radius=radius;
	}

	
	public Circle(double radius ,String colour){
		this.radius=radius;
		this.colour=colour;

	}

	



	public double getRadius(){
		return radius;
	}

	public void getColour(){
		System.out.println("Colour is :"+colour);
	}

	public double getArea(){
		return 3.14*radius*radius;
	}



}



