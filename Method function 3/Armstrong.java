/*Write a  Java  program to print all Armstrong numbers between 1 to n.*/

import java.util.Scanner;
public class Armstrong{

    static int count(int num){
        int cnt=0;
        while(num>0){
            cnt++;
            num=num/10;
        }
        return cnt;
    }

    static void armstrong(int num){
        int rem=0;
        double n=num;
        double sum=0;
        int cnt = count(num);
        while(num>0){
            rem=num%10;
            sum=sum+Math.pow(rem,cnt);
            num=num/10;
        }
       if(n==sum)
       System.out.println("Armstrong number");
       else
              System.out.println("not Armstrong number");

    }


    public static void main(String args[]){
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number: ");
        num=sc.nextInt();

        armstrong(num);
     

    }
}