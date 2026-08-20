/*Write a  Java  program to check whether a number is a Perfect number or not.

*/

import java.util.Scanner;
public class PerfectNumbers{

    static void perfect(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(num==sum){
            System.out.println("Perfect Numbers");
        }
        else
        System.out.println("Not Perfect Numbers");
        
    }

    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = sc.nextInt();

        perfect(num);

    }
}