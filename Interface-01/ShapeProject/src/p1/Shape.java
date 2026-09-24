package p1;

public interface Shape{
	

	

	public String getColour();

	public boolean isFilled();


	public void setColour(String colour);

	public void setFilled(boolean filled);



	public  double getArea();

	public  double getPerimeter();

	@Override
	public  String toString();




}