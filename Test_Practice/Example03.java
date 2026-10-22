public class Example03{
	public static void main(String[] args) {
		
		int n=9;

		int square = n*n;

		Integer n1 = new Integer(square);

		String str = n1.toString();

		System.out.println(str);

		int sum=0;

		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			int num=Character.getNumericValue(ch);
			sum+=num;
		}
		System.out.println(sum);
	}
}