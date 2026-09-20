package p2;

import p1.Restaurant;
import p1.Chef;
import p1.Menu;

public class App{
	public static void main(String[] args){

		Chef c1 = new Chef("Tony Stark","Italian");

		String item[]=new String[]{"Pizza","Pasta","Riscotto"};

		Menu m1 = new Menu(item);

		Restaurant r1 = new Restaurant("Shauryawada",c1,m1);

		r1.open();
		
	}
}