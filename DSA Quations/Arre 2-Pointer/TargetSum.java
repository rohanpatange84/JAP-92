public class TargetSum{

	public static void findTrget(int arr[], int target){

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==target){
					System.out.print(arr[i]+" "+arr[j]);
					System.out.println();

					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		

		int arr[]=new int[]{2, 5, 7, 10};
		int target = 12;

		findTrget(arr,target);


	}
}