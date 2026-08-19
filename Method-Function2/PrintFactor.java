/*Print all factors of a given number*/

import java.util.Scanner;
public class PrintFactor{

    static void findFactor(int num){
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }


    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        num=sc.nextInt();

        findFactor(num);
    }
}