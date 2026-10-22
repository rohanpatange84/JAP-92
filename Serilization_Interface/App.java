import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class App{
	public static void main(String[] args)throws IOException {
		
		Student s1 = new Student(45,"Suraj",75);

		FileOutputStream fos = new FileOutputStream("std.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(s1);
		oos.flush();
		oos.close();

        fos.close();

        System.out.println("END");


	}
}