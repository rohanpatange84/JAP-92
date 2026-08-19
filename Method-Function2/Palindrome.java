import java.util.Scanner;
public class Palindrome{

    public static int reverse(int num){
        int newno=0;
        int rem=0;
        while(num>0){
            rem=num%10;
            newno=newno*10+rem;
            num=num/10;
        }
         
        return newno;
       
    }

    public static boolean findPalindrome(int num){
        int newnoo=reverse(num);
        
        return newnoo==num;

    }

    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int reverseno=reverse(num);
        

        boolean res=findPalindrome(num);
        System.out.print(res);
        

        

    }
}