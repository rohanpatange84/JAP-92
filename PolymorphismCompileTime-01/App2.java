class Operation{
	public void doAdd(int x,int y){
		System.out.println(x+y);
	}

	public void doAdd(int x,int y,int z){
		System.out.println(x+y+z);
	}

	public void doAdd(int y,double x){
		System.out.println(x+y);
	}

	public void doAdd(double x, int y){
		System.out.println(x+y);
	}
}


public class App2{
	public static void main(String[] args) {
		Operation op = new Operation();

		op.doAdd(11,22);
		op.doAdd(11,22,33);
		op.doAdd(22,11.14);
		op.doAdd(21.52,58);
	}
}