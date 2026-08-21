/*Write a  Java  program to check whether a number is a Perfect number or not.

*/

import java.util.Scanner;
public class PerfectNumbers{

    static boolean perfect(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
            sum=sum+i;
        }
        return sum==num;
        
    }

    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = sc.nextInt();

        boolean result = perfect(num);

        if(result)
        System.out.println("Perfect number");
        else
        System.out.println("Not Perfect number");

    }
}