/*Calculate the product of digits of any number*/

import java.util.Scanner;
public class ProductOfDigit{

    public static int sum(int num){
        int pro=1;
        while(num>0){
            pro=pro*(num%10);
            num=num/10;
        }
        return pro;
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