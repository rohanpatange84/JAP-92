import java.util.Scanner;
class Account{
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

public class App6{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n;
        Account a1=new Account();

        a1.type="Saving Account";
        a1.balance=10000;
        a1.bankstatus=true;
       
        do{
        System.out.println("________________________________");
        System.out.println("Entter 1---------AccountType");
        System.out.println("Entter 2---------CheckBalance");
        System.out.println("Entter 3---------DepositeMoney");
        System.out.println("Entter 4---------WithdrawMoney");
        System.out.println("Entter 5---------Shut Down Bank");

        System.out.print("Enter value: ");
        n=sc.nextInt();
            
        switch(n){
            case 1:
                a1.accountType();
            break;

            case 2:
                System.out.println("Your account balance is:"+a1.checkBalance());
            break;

            case 3:
                 System.out.print("How much money deposite: ");
                 a1.depomoney=sc.nextInt();
                 a1.depositeMoney();
                 System.out.println("Money Deposite Succesfull");
            break;

            case 4:
                
                 System.out.print("How much money Withdraw: ");
                 
                 a1.withdrawmoney=sc.nextInt();
                 if(a1.balance<a1.withdrawmoney){
                    System.out.println("Insufficent Balance");
                 }else{
                 a1.withdrawMoney();
                 System.out.println("Money Withdraw Succesfull");

                 }
            break;

            case 5:
                a1.bankstatus=false;
                break;

            default:
                System.out.println("Invalid Input");
            break;
                

        }
        }while(a1.bankstatus);
        

    }
}