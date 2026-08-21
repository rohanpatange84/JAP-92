/*Write a  Java  program to print all Prime numbers between 1 to n.*/

import java.util.Scanner;
public class PrimeNum{

    public static boolean isPrime(int num){

     

        for(int i=2;i<num;i++){
            if(num%i==0) return false;
          
        }
         return true;

    }
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        num= sc.nextInt();

        boolean result=isPrime(num);

        if(result)
        System.out.println("Prime Number");
        else
        System.out.println("Not Prime Number");
        
    }
}