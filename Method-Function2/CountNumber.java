/*Count the number of digits in any number*/

import java.util.Scanner;
public class CountNumber{

    public static int countNum(int num){
        int cnt=0;
        while(num>0){
            cnt++;
            num=num/10;
        }
        return cnt;

    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number: ");
        num=sc.nextInt();

        int count=countNum(num);
        System.out.print("The count is: "+count);

    }
}