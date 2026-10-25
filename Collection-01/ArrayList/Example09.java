import java.util.ArrayList;

public class Example09{
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9};

		ArrayList<Integer> list = new ArrayList<>();

		for(int i=0;i<arr.length;i++){
			list.add(arr[i]);
		}

		System.out.println(list);
		list.remove(3);

		int brr[]=new int[list.size()];

		for(int i =0;i<brr.length;i++){
			brr[i]=list.get(i);
		}

		for(int num:brr){
			System.out.print(num+" ");
		}
	}
}