package p1;

public class Restaurant{
	private String name;
	private Chef chef;
	private Menu menu;

	public Restaurant(String name, Chef chef , Menu menu){
		this.name=name;
		this.chef=chef;
		this.menu=menu;
	}

	public void open(){
		System.out.println(name+" is now open");
		chef.cook();
		menu.showMenu();
	}

}