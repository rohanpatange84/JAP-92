package p2;

public class Spider extends Animal{

	public Spider(int leg){
		super(leg);
	}

	@Override
	public void eate(){
		System.out.println("Spiner Eating ::");
	}
}