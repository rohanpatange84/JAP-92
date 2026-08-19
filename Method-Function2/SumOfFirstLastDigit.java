/*Find the sum of the first and last digit of any number */

import java.util.Scanner;
public class SumOfFirstLastDigit{

    public static int first(int num){
        int first=0;
        while(num>0){
            first=num%10;
            num=num/10;
        }
        return first;
    }

    public static int last(int num){
        return num%10;
    }

    public static int sum(int n1,int n2){
        return n1+n2;
    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num=sc.nextInt();


        int firstnum=first(num);
        int lastnum=last(num);
        int sumofdigit=sum(firstnum,lastnum);

        

        System.out.println("First number of digit is: "+firstnum);
        System.out.println("Last number of digit is: "+lastnum);
        System.out.println("Sum of digit is: "+sumofdigit);

        


    }
}