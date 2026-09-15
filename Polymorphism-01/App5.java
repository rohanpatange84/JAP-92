class A{
	public static void main(String[] args){
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
	}

	public static void main(int[] args){
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
	}
}

public class App5{
	public static void main(String[] args) {
		String arr[]=new String[]{"Rohan","Dinesh","Vivek"};
		int arr1[]=new int[]{1,2,3,4,5};
		A.main(arr);

		A.main(arr1);


		
	}
}