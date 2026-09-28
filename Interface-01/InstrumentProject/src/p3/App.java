package p3;


import p1.Instrument;
import p2.Wind;
import p2.Percussion;
import p2.Stringed;
import p2.Woodwind;
import p2.Bass;

public class App{

	public static void run(Instrument i1){
		i1.play();
	}
	public static void main(String[] args) {

		Instrument i1[] ={new Wind(), new Percussion(), new Stringed(), new Woodwind(), new Bass()}; 

		
		

		

		for(Instrument inst:i1){
			run(inst);

		}
		
	}
}