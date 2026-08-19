/*Find HCF (GCD) of two numbers*/

import java.util.Scanner;
public class HCF{

    static int findHCF(int num1,int num2){
        
        int res=0;
        if(num1>num2){
        for(int i=1;i<=num1;i++){
             if(num2%i==0&&num1%i==0){
               res=i;  
            }
         
        }
        }else{
              for(int i=1;i<=num2;i++){
            if(num2%i==0&&num1%i==0){
                 res=i;   
            }
              
            
        }

        }
        return res;
    }

    public static void main(String args[]){

        int num1,num2;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter num1: ");
        num1=sc.nextInt();
        System.out.print("Enter num2: ");
        num2=sc.nextInt();

        int result=findHCF(num1,num2);
        System.out.println("The HCF is: "+result);
    }
}