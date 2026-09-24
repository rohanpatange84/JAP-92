interface CanFight{
	void fight();
	
}

interface CanFly{
	void fly();
}

interface CanSwim{
	void swim();
}

class Action{
	public void fight(){
		System.out.println("CanFight Interface");
	}
}

class Hero extends Action implements CanFly, CanSwim, CanFight{

	@Override
	public void fly(){
		System.out.println("CanFly Interface");
	}

	@Override
	public void swim(){
		System.out.println("CanSwim Interface");
	}

}


public class App{

	public static void u(CanFight cft){
		cft.fight();
	}
	public static void v(CanFly cf){
		cf.fly();
	}

	public static void w(CanSwim cs){
		cs.swim();
	}

	public static void main(String[] args) {

		Hero h1 = new Hero();

		u(h1);
		v(h1);
		w(h1);


		
	}
}