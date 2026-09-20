package p1;

public class Menu{
	private String item[]=new String[3];

	public Menu(String item[]){
		for(int i=0;i<item.length;i++){
			this.item[i]=item[i];
		}
	}

	public void showMenu(){
		for(int i=0;i<item.length;i++){
			System.out.println((i+1)+". "+item[i]);
		}
	}
}