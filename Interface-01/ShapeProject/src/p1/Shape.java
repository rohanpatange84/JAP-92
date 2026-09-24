package p1;

public interface Shape{
	String colour="Red";
	boolean filled=true;

	

	public String getColour();
	// public void setColour();

	

	public boolean isFilled();

	// public void setFilled();





	public abstract double getArea();

	public abstract double getPerimeter();

	@Override
	public abstract String toString();




}