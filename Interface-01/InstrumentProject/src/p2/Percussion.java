package p2;


import p1.Instrument;

public class Percussion implements Instrument{
	String name="Percussion";

	@Override
	public void play(){
		System.out.println("Percussion playing ::");
	}

	@Override
	public String what(){ return name; }

	@Override	
	public void adjust(){
		System.out.println("Percussion Adjust ::");
	}
}