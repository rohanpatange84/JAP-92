public class ex18{

	public static int  getFirstDigit(int num){
		int rem=0;
		while(num>0){
			rem=num%10;
			num=num/10;

		}
		return rem;
	}


	public static void main(String[] args) {
		int arr[]=new int[]{123,235,6754,3257,64,2367,288,35,645,374};

		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			arr[i]=getFirstDigit(arr[i]);

			System.out.print(arr[i]+",");
		}
		System.out.print("}");

	}
}