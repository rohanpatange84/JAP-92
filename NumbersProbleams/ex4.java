// Write a Java program to count the number of digits in any number.

import java.util.Scanner;
public class ex4{
    public static void main(String args[]){
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number :");
        num= sc.nextInt();
        int count=0;

        while(num>0){
            count++;
            num=num/10;
        }
        System.out.println("Count is :"+count);

    }
}