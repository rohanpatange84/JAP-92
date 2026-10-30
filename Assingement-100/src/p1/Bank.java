package p1;
import p1.Account;
public class Bank extends Account {
	
	private int bankId;
	private String  bankName;
	private String branch;
	{
		bankName="101";
		bankName="State Bank Of India";
		branch=null;
	}
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public Bank(String branch) {
		super();
		this.branch = branch;
	}

	public int getBankId() {
		return bankId;
	}


	public String getBankName() {
		return bankName;
	}

	
	public String getBranch() {
		return branch;
	}

	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", branch=" + branch + "]";
	}
	
	
	public void displayAccountDetails(Account a1) {
		
		super.displayAccountDetails();
		
		
		
	}
	
	public void createAccount(String username, double balance) {
		
	}
	
	
	
	

	
	
	
	
	

}
