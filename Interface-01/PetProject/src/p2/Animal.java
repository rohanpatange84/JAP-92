package p2;


public abstract class Animal{
	protected int leg;

	protected Animal(int leg){
		this.leg=leg;
	}

	public  void walk(){
		System.out.println("Animal walking ::"+"Legs:"+leg);
	}

	public abstract void eate();
}