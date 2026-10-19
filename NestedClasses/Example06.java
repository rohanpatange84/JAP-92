class Hello{
	int num=10;

	public void f1(){
		class Demo{
			int demonum = 50;
			public void printDemo(){
				System.out.println(demonum);
			}
		}
		Demo d1 = new Demo();
		d1.printDemo();
	}

}
public class Example06{
	public static void main(String[] args) {
		Hello h1 = new Hello();
		h1.f1();

	}
} 