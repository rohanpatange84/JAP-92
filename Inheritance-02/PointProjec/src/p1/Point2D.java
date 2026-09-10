package p1;

public class Point2D{
	private float x=0.0f;
	private float y=0.0f;

	public Point2D(){

	}

	public Point2D(float x,float y){
		this.x=x;
		this.y=y;
	}

	//getter

	public float getX(){
		return x;
	}

	public float getY(){
		return y;
	}

	public float[] getXY(){
		float arr[]=new float[]{x,y};
		return arr;
	}

	//setter

	public void setX(float x){
		this.x=x;
	}

	public void setY(float y){
		this.y=y;
	}

	public void setXY(float x,float y){
		this.x=x;
		this.y=y;
	}
}