/*
Write a Java program to check whether a number is a Duck Number or not.
Note: A Duck number is a number which has zeroes present in it, but there should be no zero present in the beginning of the number. For example 3210, 7056, 8430709 are all duck numbers whereas 08237, 04309 are not.
Expected Output

Input a number : 3210                                                   
Duck number
*/
import java.util.Scanner;
public class DuckNumber{
   
    static boolean isDockNum(int num){
         int last=lastDigit(num);
         if (last==0) return false;
         int rem=0;
         while(num>0){
            rem=num%10;
            if(rem==0) ;
           
            num=num/10;
             break;

         }
         return true;
    }

    static int lastDigit(int num){
        int rem=0;
        while(num>0){
            rem=num%10;
           if (num==0){return num;
           break;
           }
            num=num/10;
           
            
        }
         
        return rem;
    }
    public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Num: ");
        num=sc.nextInt();

        boolean result=isDockNum(num);
        if(result)
            System.out.println("Dock Number");
        else
         System.out.println("not Dock Number");

         int a=lastDigit(num);
         System.out.println(a);


    }
}