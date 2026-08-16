//   Write a Java program to find the first and last digit of any number.

import java.util.Scanner;
public class ex5{
    public static void main(String args[]){
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number :");
        num =sc.nextInt();
        int lastno=num%10;
        int rem=0;

       

        while(num>0){
            
            rem=num%10; 
            num=num/10;
        }
        
          System.out.println("First no is :"+rem);
           System.out.print("Last no is :"+lastno);
    }
}