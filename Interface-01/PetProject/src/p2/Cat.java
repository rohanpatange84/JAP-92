package p2;

import p1.Pet;

public class Cat extends Animal implements Pet{

	String name= "Cat";

	public Cat(int leg,String name){
		super(leg);
		this.name=name;
	}




	@Override
	public  void walk(){
		System.out.println("Cat walking ::"+"Legs: "+super.leg);
	}

	@Override
	public  void eate(){
		System.out.println("Cat eating ::");
	}


	@Override
	public String getName(){
		return name;
	}
 
 	@Override
	public void setName(String name){
		this.name=name;
	}

	@Override
	public void play(){
		System.out.println("Cat playing ::");
	}

}