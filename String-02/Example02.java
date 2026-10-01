//    Write a Java  program to reverse order of words in a given string.  


public	 class	Example02{

	public static  int countSpace(String str){
		int cnt=0;
		for(int i=0;i<str.length();i++){
			
				if(str.charAt(i)==' ')
					cnt++;
		}
		return cnt;
	}

	public static String reverseOrder(String	str){

		String newstr[]=str.split(" ");
		int cnt=countSpace(str);

		String ans="";
	
		int k=newstr.length-1;

		for(int i=0;i<newstr.length;i++){
				ans=ans+newstr[k--];
				if(cnt>=1){
					ans=ans+" ";
					cnt--;
				}
		}
		return ans;
		
	}

	public static void main(String[] args) {

		String str="I am java developer";

		String ans=reverseOrder(str);
		System.out.println(ans);

		System.out.println(ans.length() +" "+str.length());

			


	}
}	