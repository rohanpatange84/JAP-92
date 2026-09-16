class Operation{


	public static void doAdd(int x,int y){
		System.out.println(x+y);
	}


	public void doSub(int x,int y){
		System.out.println(x-y);
	}
}

public class App{
	public static void main(String[] args) {

		// Operation op=new Operation();

		// op.doAdd(11,22);
		// op.doSub(22,11);

		Operation.doAdd(11,33);
		Operation.doSub(11,33);
		
	}
}