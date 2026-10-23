import java.util.List;
import java.util.ArrayList;

public class Example04{
	public static void main(String[] args) {

		List<Integer> num = new ArrayList<>();
		num.add(11);
		num.add(12);
		num.add(13);
		num.add(14);
		num.add(15);

		Object obj[]=num.toArray();

		Integer arr[]= new Integer[num.size()];
		arr=num.toArray(arr);

		intn brr[]=new int[num.size()];


		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			//brr[i]=arr[i];
		}

		System.out.println();

		for(int i=0;i<arr.length;i++){
			System.out.print(brr[i]+" ");
		}



		
		
	}
}