public class Demo{
	public static void main(String[] args) {


		/*if(args[0].equals("sum")){
			int sum=0;
			for(int i=1;i<args.length;i++){
				int num=Integer.parseInt(args[i]);
				sum+=num;
			}
			System.out.println(sum);
		}*/

		if(args[0].equals("pal")){
			String str=args[1];
			int start=0;
			int end=str.length()-1;
			while(start<end){
				if(str.charAt(start)!=str.charAt(end)){
					System.out.println("Not Palindrome");
					return;
				}
				start++;
				end--;
			}
			System.out.println("Palindrome");
		}
	}
}

