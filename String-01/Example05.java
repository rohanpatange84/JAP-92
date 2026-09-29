public  class Example05{
	public static void main(String[] args) {
		
		String name = "Rohan";

		char namech[]=name.toCharArray();

		char newName[]=new char[namech.length];

		// for(char ch:namech){
		// 	System.out.println(ch+" ");
		// }

		for(int i=0;i<newName.length;i++){
			newName[i]=namech[i];
		}

		String nn = new String(newName);

		System.out.println(nn);
	}
}