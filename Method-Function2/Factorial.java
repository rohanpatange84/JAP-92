/*Calculate the factorial of a number*/

import java.util.Scanner;
public class Factorial{

    public static int factorial(int num){
            int res=1;
            for(int i=num;i>=1;i--){

                res=res*i;
            }
            return res;
        }


    public static void main(String args[]){
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your number: ");
        num=sc.nextInt();

        int result=factorial(num);
        System.out.println("Factorial is: "+result);


    }
}