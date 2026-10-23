import java.util.List;
import java.util.ArrayList;

public class Example06{
	public static void main(String[] args) {

		List<Integer> num = new ArrayList<>();

		for(int i=1;i<=10;i++){
			num.add(i);
		}

		System.out.println(num);
		
		
		
			num.remove(8);
	
	System.out.println(num);

	num.remove(Integer.valueOf());

	System.out.println(num);

	}
}