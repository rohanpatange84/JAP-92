package p2;


import p1.Pet;

public class Fish extends Animal implements Pet{

	String name="Fish";



	public Fish(int legs,String name){
		super(legs);
		this.name=name;
	}



	@Override
	public  void walk(){
		System.out.println("Fish walking ::");
	}

	@Override
	public  void eate(){
		System.out.println("Fish eating ::");
	}

	@Override
	public String getName(){ return name; }

	@Override
	public void setName(String name){
		this.name=name;
	}

	@Override
	public void play(){
		System.out.println("Fish palying");
	}
}