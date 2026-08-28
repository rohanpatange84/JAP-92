class Bank{

	//instance variable
	private String name;
	private int accountno;

	//static variable
	static String bankname;
	static int intrest;
	static int cnt;

	//instance block
	{
		name ="XYZ";
		accountno=0000;
	}

	//static block
	static{
		bankname="SBI";
		intrest=6;
	}

	//constructor
	public Bank(String name,int accountno){
		this.name=name;
		this.accountno=accountno;
		cnt++;
	}

	public void getInfo(){
		System.out.println("Name: "+name);
		System.out.println("Account No.: "+accountno);
		System.out.println("Bank name: "+bankname);
		System.out.println("intrest: "+intrest);
		System.out.println("Present users: "+cnt);


	}


}



public class App3{
	public static void main(String[] args) {

		Bank b1=new Bank("Rohan",651148266);

		b1.getInfo();
		
	}
}