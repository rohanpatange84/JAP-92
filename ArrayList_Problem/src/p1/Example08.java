package p1;

public class Example08 {
	public static void main(String[] args) {
		
		int arr[]= {0};
		Integer num=0;
		String ss="";
		
		 if(arr[0]==0){
             arr[0]=1;
            System.out.println("ss"+arr[0]);
         }
		
		if(arr.length==1) {
			num = arr[0]+1;
			ss=num.toString();
			int arr1[]=new int[2];
			for(int i=0;i<ss.length();i++) {
				arr1[i]=Character.getNumericValue(ss.charAt(i));
			}
			
			for(int i=0;i<ss.length();i++) {
				System.out.println(arr1[i]);
			}
			
		}
		
//		System.out.println(num);
//		System.out.println(ss);
	
		
	}
}
