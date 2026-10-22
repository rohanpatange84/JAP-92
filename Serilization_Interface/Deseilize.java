import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deseilize{
	public static void main(String[] args)throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("std.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		     Student s1=(Student)ois.readObject();

                if(s1!=null){

                         System.out.println(s1.getRollno());

                         System.out.println(s1.getName());

                         System.out.println(s1.getMark());

                }

                

                ois.close();

                fis.close();


                System.out.println("THANKS ");
		
	}
}