import java.util.Scanner;
public class exx2{
    public static void main(String args[]){
        int n1;
        int n2;
        int n3;
        int n4;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First no:");
        n1=sc.nextInt();
        System.out.println("Enter First no:");
           n2=sc.nextInt();

        System.out.println("Enter First no:");
           n3=sc.nextInt();
        System.out.println("Enter First no:");
           n4=sc.nextInt();

        int large=(n1>n2&&n1>n3&&n1>n4)?n1:(n2>n3&&n2>n4)?n2:(n3>n4)?n3:n4;

        System.out.println("Large number is:"+large);
    }

}