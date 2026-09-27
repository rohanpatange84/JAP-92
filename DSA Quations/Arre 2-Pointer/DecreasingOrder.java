public class DecreasingOrder{


	public static int[] descreasingArre(int arr[]){
		int i=0;
		int j=arr.length-1;
		int ans[]=new int[arr.length];
		int k=0;

		while(i<=j){
			if(Math.abs(arr[i])>Math.abs(arr[j])){
				ans[k++]=arr[i]*arr[i];
				i++;
			}else{
				ans[k++]=arr[j]+arr[j];
				j--;
			}

		}
		return ans;
	}




	public static void printArr(int arr[]){
		for(int num:arr){
			System.out.print(num+" ");
		}
		System.out.println();
	}

	public static int [] swap(int arr[],int i,int j){
		arr[i]=arr[i]+arr[j];
		arr[j]=arr[i]-arr[j];
		arr[i]=arr[i]-arr[j];

		return arr;
	}

	public static void main(String[] args) {
		int arr[]=new int[]{-10,-3,-2,1,2,5,12};
		printArr(arr);
		int ans[]=descreasingArre(arr);

		printArr(ans);

	}
}