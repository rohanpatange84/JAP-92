
import java.util.Scanner;
public class CheckArms{

    static int count(int num){
        int cnt=0;
        while(num>0){
            cnt++;
            num=num/10;
        }
        return cnt;
    }

    static void armstrong(int n){

        for(int num=1;num<=n;num++){
        int rem=0;
       
        double sum=0;
        int cnt = count(num);
        while(num>0){
            rem=num%10;
            sum=sum+Math.pow(rem,cnt);
            num=num/10;
        }
       if(n==sum)
       System.out.println(n);
       else
              System.out.println("not Armstrong number");
        }

    }


    public static void main(String args[]){
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number: ");
        num=sc.nextInt();

        armstrong(num);
     

    }
}