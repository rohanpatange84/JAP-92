 /*Write a  program to enter two numbers and perform all arithmetic operations. */


import java.util.Scanner;
public class ArithmaticOpe{

    static void doAdd(int x,int y){
        int z=x+y;
        System.out.println("The sum of two number is: "+z);
    }

    static void doSub(int x,int y){
        int z=x-y;
        System.out.println("The sub of number is: "+z);
    }

    static void doMul(int x,int y){
        int z=x*y;
        System.out.println("The product of number is: "+z);
    }

    static void doDiv(int x,int y){
        int z=x/y;
        System.out.println("The division of number is: "+z);
    }

    static void doMod(int x,int y){
        int z=x%y;
        System.out.println("The modules of number is: "+z);
    }

    public static void main(String args[]){
        int num1;
        int num2;
        Scanner sc =new Scanner(System.in);
        System.out.print("Entter num1:");
        num1=sc.nextInt();
        System.out.print("Enterr num2:");
        num2=sc.nextInt();

        doAdd(num1,num2);
        doSub(num1,num2);
        doMul(num1,num2);
        doDiv(num1,num2);
        doMod(num1,num2);

    }
}