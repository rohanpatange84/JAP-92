public class ShiftZeroLast{
	public static void main(String[] args) {
		int arr[]= new int[]{1,0,1,0,0,1,0,1,0,1};
		int cnt=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0)
				cnt++;
		}

		for(int i=0;i<arr.length;i++){
			if(i<cnt){
				arr[i]=0;
			}
			else{
				arr[i]=1;
			}
		}

		for(int n:arr){
			System.out.print(n+" ");
		}
	}
}