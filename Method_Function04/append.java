import java.util.Scanner;
public class append{

    static int append(int num1,int num2){
        int cnt=count(num2);
        int multi=multiplxer(cnt);
        
        int newnum=num1*multi+num2;
        return newnum;
    }

   static int count(int num){
        int cnt=0;
        while(num>0){
            cnt++;
            num=num/10;
        }
        return cnt;

    }
    static int multiplxer(int cnt){
        int multiplxer=1;
        while(cnt>=1){
            cnt--;
            multiplxer=multiplxer*10;
        }
        return multiplxer;
    }
    public static void main(String args[]){
        int num1;
        int num2;
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter num1: ");
        num1=sc.nextInt();
        System.out.print("Enter num2 :");
        num2=sc.nextInt();

        int result=append(num1,num2);
        System.out.print("New number is: "+result);






    }
}