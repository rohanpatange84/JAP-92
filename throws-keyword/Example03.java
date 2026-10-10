import java.io.File;
import java.io.IOException;

public class Example03{

	public static void f1() throws Exception{
		System.out.println("f1 start");
		f2();
		System.out.println("f1 end");
	}

	public static void f2() throws Exception{
		System.out.println("f2 start");
		f3();
		System.out.println("f2 end");
	}


	public static void f3() throws Exception{
		System.out.println("f3 start");
		File file = new File("Hello Text3");
		file.createNewFile();

		Thread.sleep(300);

		System.out.println("f3 end");
	}

	public static void main(String[] args) throws Exception {

		System.out.println("main start");
		f1();

		System.out.println("mian end");
		
	}
}