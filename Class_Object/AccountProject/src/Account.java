public class Account{
	String type;
    int balance;
    int depomoney;
    int withdrawmoney;
    boolean bankstatus;

    void accountType(){
      System.out.println("The account is:"+type);
    }
    void depositeMoney(){
       
        balance=balance+depomoney;
    }
    void withdrawMoney(){
       
        balance=balance-withdrawmoney;
    }

    int checkBalance(){
        return balance;
    }
}