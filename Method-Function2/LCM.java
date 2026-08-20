import java.util.Scanner;
public class LCM{

    static int findLCM(int num1,int num2){
        int n1=0;
        int n2=0;
        for(int i=1;i<=10;i++){
            n1=num1*i;
            n2=num2*1;
            if(n1==n2);
            break;
           
        }
        return n1;
    }
    public static void main(String args[]){

         int num1,num2;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter num1: ");
        num1=sc.nextInt();
        System.out.print("Enter num2: ");
        num2=sc.nextInt();

        int result=findLCM(num1,num2);
        System.out.print("The LCM is: "+result);
    }
}