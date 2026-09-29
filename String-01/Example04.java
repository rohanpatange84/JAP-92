//    Write a Java  program to concatenate two strings.



public  class Example04{
	public static void main(String[] args) {
		String name="Rohan";
		String surname="Patange";

		char namech[]=name.toCharArray();
		char surnamech[]=surname.toCharArray();

		char fullname[]=new char[namech.length+surnamech.length];

		int k=0;

		for(int i=0;i<namech.length;i++){
			fullname[k++]=namech[i];
		}

		for(int i=0;i<surnamech.length;i++){
			fullname[k++]=surnamech[i];
		}

		String fn=new String(fullname);

		System.out.println(fn);
	}
}