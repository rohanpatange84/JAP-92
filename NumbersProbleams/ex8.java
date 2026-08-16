// Write a Java program to enter any number and check whether the number is palindrome or not.
import java.util.Scanner;
public class ex8{
    public static void main(String args[]){
        String num;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number:");
        num = sc.next();

        int temp=num;

        int rev=0;
        int rem=0;

        while(num>0){
            rem =num%10;
            rev=rev*10+rem;
            num =num/10;
        }

        if(temp==rev){
            System.out.print("Palindrome");
        }else{
             System.out.print("Not Palindrome");

        }



    }
}