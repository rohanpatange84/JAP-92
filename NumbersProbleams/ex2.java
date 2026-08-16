import java.util.Scanner;
public class ex2{
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        num= sc.nextInt();

        int sum=0;
        //for odd

        for(int i=1;i<=num;i=i+2){
        sum=sum+i;
        }

        // // for even
        // for(int i=1;i<=num;i=i+2){
        // sum=sum+i;
        // }
    System.out.println("The sum of odd number is :"+sum);

    }
}