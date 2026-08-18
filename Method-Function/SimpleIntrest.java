import java.util.Scanner;
public class SimpleIntrest{

    static void simpleIntrest(int p,int t,int r){
        double si = (p*t*r)/100;
        System.out.println("The Simple Intrest is: "+si);
    }

    public static void main(String args[]){
        int p;
        int t;
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Principal: ");
        p=sc.nextInt();
        System.out.print("Enter a Time: ");
        t=sc.nextInt();
        System.out.print("Enter a Rate: ");
        r=sc.nextInt();


        simpleIntrest(p,t,r);



    }
}