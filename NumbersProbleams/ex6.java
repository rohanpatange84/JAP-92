//   Write a Java program to calculate the sum of digits of any number.

import java.util.Scanner;
public class ex6{
    public static void main(String args[]){
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number :");
        num = sc.nextInt();

        int sum=0;
        int rem;

        while(num>0){
            rem=num%10;
            sum =sum+ rem;
            num =num/10;
        }
        System.out.print("Sum of number is :"+sum);
    }
}