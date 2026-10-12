import java.io.FileWriter;
import java.io.IOException;

public class Example07{

	public static void createFile(String file) throws IOException{
		FileWriter fw=null;
		fw=new FileWriter(file+".txt");
			fw.write(100);  
			fw.write("\n");
			fw.write("Hello");
			fw.write("\n");
			char arr[]={'A','B','C','D'};
			fw.write(arr);

			fw.flush();
			fw.close();

	}

	public static void main(String[] args) {

		String name[]={"Rohan", "Dinesh","Suraj"};
		
		try{
			for(int i=0;i<name.length;i++){
				createFile(name[i]);
			}
		}catch(IOException e){

		}
	}
}