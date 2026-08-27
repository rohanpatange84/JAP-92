public class Rectangle{
	private float length;
	private float width;


	//constructor
	public Rectangle(){
		length=1.0f;
		width=1.0f;
	}

	public Rectangle(float length,float width){
		this.length=length;
		this.width=width;

	}



	//getter
	public float getLength(){
		return length;
	}

	public float gitWidth(){
		return width;
	}

	public double getArea(){
		return length*width;

	}

	public double getPerimeter(){
		return 2*(length*width);
	}




	//setter
	public void setWidth(float width){
		this.width=width;

	}
	public void setLength(float length){
		this.length=length;
	}

	
}