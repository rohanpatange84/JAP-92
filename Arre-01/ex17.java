public class ex17{
	public static void main(String[] args) {
		int arr[]=new int[]{3,6,9,12,15};
		int sum=30;
		System.out.println("Pairs with sum "+sum+":");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				for(int k=j+1;k<arr.length;k++){
					if (arr[i]+arr[j]+arr[k]==sum)
					System.out.println("("+arr[i] +","+arr[j]+","+arr[k]+")");

				}
				
			}
		}
	}
}