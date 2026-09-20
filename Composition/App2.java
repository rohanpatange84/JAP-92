class Battery{

	public void getMah(){
		System.out.println("4000Mah");
	}

	public void getBackup(){

		System.out.println("6 hours");

	}
}

class Processor{

	public void getProcessor(){
		System.out.println("MediaTek Helio P70 octa-core");
	}

	public void getClockSpeed(){
		System.out.println("2.6 GHz");
	}
}

class Camera{

	public void realCamera(){
		System.out.println("48mb, 8mb, 2mb, 2mb");
	}

	public void frontCamera(){
		System.out.println("16mb");
	}
}

class Mobile{
	Battery battery;
	Processor processor;
	Camera camera;


	public Mobile(){
		battery= new Battery();
		processor= new Processor();
		camera= new Camera();
	}


}



public class App2{
	public static void main(String[] args) {

		Mobile oppo =new Mobile();

		oppo.battery.getMah();

		oppo.processor.getProcessor();

		oppo.camera.realCamera();
		
	}
}