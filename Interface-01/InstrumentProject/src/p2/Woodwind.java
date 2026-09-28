package p2;

public class Woodwind extends Wind{

	@Override
	public void play(){
		System.out.println("Woodwind playing ::");
	}

	@Override
	public String what(){ return super.name; }




}