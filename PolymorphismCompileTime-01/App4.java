/*

can we overload static method ?
Yes

*/
class A{

	public static void doAdd(int x,int y){
		System.out.println(x+y);
	}

	public static void doAdd(int x,int y,int z){
		System.out.println(x+y+z);
	}


}

public class App4{
	public static void main(String[] args) {

		A.doAdd(11,22);
		A.doAdd(11,22,33);
		
	}
}