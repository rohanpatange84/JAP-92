// print table of a number

import java.util.Scanner;
public class ex3{
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        num=sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(i*num);
        }
    }
}