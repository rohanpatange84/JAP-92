/*Calculate the sum of digits of any number*/

import java.util.Scanner;
public class SumOfDigit{

    public static int sum(int num){
        int sum=0;
        while(num>0){
            sum=sum+(num%10);
            num=num/10;
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num=sc.nextInt();

        int sumofdigit=sum(num);
        System.out.println("The sum of the number is: "+sumofdigit);
        

    }
}