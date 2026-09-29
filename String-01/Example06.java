//   Write a Java  program to compare two strings.

public class Example06{
	public static void main(String[] args) {
		
		String name1= "Rohan";
		String name2="Mohan";

		char name1ch[]=name1.toCharArray();
		char name2ch[]=name2.toCharArray();

		boolean res = true;
		for(int i=0;i<name1ch.length;i++){
			if(name1ch[i]!=name2ch[i]){
				res=false;

			}
		}

		if(res){
			System.out.println("Both are same");
		}else{
			System.out.println("not same");
		}
	}
}