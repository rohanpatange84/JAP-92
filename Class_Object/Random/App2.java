class Hello{
	public static Hello h1;


	public Hello(){
		System.out.println("Constructor");

	}

	public static Hello getInstance(){
		
		if(h1!=null)
			return h1;
		else
			h1=new Hello();
			return h1;
		
	}

}

public class App2{
	public static void main(String[] args) {

		Hello h1 = Hello.getInstance();
		Hello h2 = Hello.getInstance();
		Hello h3= Hello.getInstance();
		

		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		System.out.println(h3.hashCode());


	}
}
