public class Demo{
	public static void main(String[] args) {
		int arr[]={11,11,22,11,23,55,14,14};
		int brr[]=new int[arr.length];

		int size=0;

		for(int i=0;i<arr.length;i++){
			int cnt=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j])
					cnt++;

			}
			brr[i]=cnt;
			
		}

		for(int i=0;i<brr.length;i++){
			System.out.println(brr[i]);
		}
		
	}
}
