package p2;


import p1.Instrument;

public class Stringed implements Instrument{
	String name="Stringed";

	@Override
	public void play(){
		System.out.println("Stringed playing ::");
	}

	@Override
	public String what(){ return name; }

	@Override
	public void adjust(){
		System.out.println("Stringed Adjust ::");
	}
}