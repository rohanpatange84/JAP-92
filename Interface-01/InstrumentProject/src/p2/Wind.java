package p2;

import p1.Instrument;

public class Wind implements Instrument{

	String name="Wind";


	@Override
	public void play(){
		System.out.println("Wind playing ::");
	}

	@Override
	public String what(){ return name; }

	@Override
	public void adjust(){
		System.out.println("Wind Adjust ::");
	}

}