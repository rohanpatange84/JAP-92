import java.io.FileWriter;
import java.io.IOException;

public class Example06{
	public static void main(String[] args) {
		FileWriter fw=null;
		try{

			fw=new FileWriter("Hello.txt");
			fw.write(100);  
			fw.write("\n");
			fw.write("Hello");
			fw.write("\n");
			char arr[]={'A','B','C','D'};
			fw.write(arr);

			fw.flush();
		
		}catch(IOException e){
			System.out.println("Exception cause");

		}finally{
			try{
				fw.close();
			}catch(IOException e){

			}
		}
	}
}