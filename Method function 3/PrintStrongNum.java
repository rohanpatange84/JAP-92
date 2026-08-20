
import java.util.Scanner;
public class PrintStrongNum{

     public static int factorial(int num){
            int res=1;
            for(int i=num;i>=1;i--){

                res=res*i;
            }
            return res;
        }

    public static int findStrong(int num){
        int res;
        int sum=0;
        while(num>0){
            res=num%10;
            sum=sum+factorial(res);
            num=num/10;
        }
        return sum;
    }

    static int printStrongNum(int n){
        int res=1;
        for(int i=1;i<=n;i++){
            res=findStrong(i);
        }
        return res;
        
    }

public static void main(String args[]){
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    num=sc.nextInt();
    int result=findStrong(num);
    String msg = (num==result)?"Strong number":"Not Strong number";
    System.out.println(msg);

   int result2= printStrongNum(num);
   System.out.println(result2);
    

}
}