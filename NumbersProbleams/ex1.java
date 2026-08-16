// sum of n mumbers

import java.util.Scanner;
public class ex1{
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("The sum is :"+sum);
    }
}