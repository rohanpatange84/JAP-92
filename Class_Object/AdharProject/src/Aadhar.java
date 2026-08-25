public class Aadhar{
	String name;
	String dop;
	long adharnum;
	String addres;
	boolean status=true;


	public void displayName(){
		System.out.println("Name : "+name);
	}
	public void displayDop(){
		System.out.println("DOP is : "+dop);
	}
	public long displayAdharNum(){
		return adharnum;
	}
	public void displayAddres(){
		System.out.println("Adress is : "+addres);
	}
	public void changeName(String newname){
		name=newname;
	}
	public void changeDop(String newdop){
		dop=newdop;
	}

}