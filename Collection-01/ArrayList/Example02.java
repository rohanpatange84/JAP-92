import java.util.List;
import java.util.ArrayList;

public class Example02{
	public static void main(String[] args) {

		List<Integer>num=new ArrayList<>();

			System.out.println(num.size());

		for(int i=1;i<=20;i++){
			num.add(i);
		}

		System.out.println(num);

		System.out.println(num.size());

		for(int i=1;i<=10;i++){
			num.remove(Integer.valueOf(i));
		}

		System.out.println(num);

			System.out.println("size "+num.size());

		// for(int i=11;i<=20;i++){
		// 	System.out.println(num.contains(Integer.valueOf(i)));
		// }


		for(int i=0;i<10;i++){
			System.out.println(num.remove(i));
		}


			System.out.println("size "+num.size());

			System.out.println(num);
		


	}
}