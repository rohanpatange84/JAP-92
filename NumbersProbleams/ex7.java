//   Write a Java program to enter any number and print its reverse.

import java.util.Scanner;

public class ex7{
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num=sc.nextInt();
        int sum=0;
        int rem=0;
        while(num>0){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        System.out.print("The reverse is :"+sum);

    }
}