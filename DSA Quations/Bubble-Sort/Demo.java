public class Demo{
	public static void main(String[] args) {
		String str="bbbbanana";


		int index=0;
		int cnt1=0;

		for(int i=0;i<str.length();i++){
			int cnt=0;
			for(int j=0;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					cnt++;
				}
				if(cnt1<cnt){
					index=i;
				}
			}
		}

		System.out.println(str.charAt(index));
	}
}