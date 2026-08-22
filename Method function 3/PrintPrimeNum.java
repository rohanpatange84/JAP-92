import java.util.Scanner;
public class PrintPrimeNum{

    static boolean isPrime(int num){
        if(num==1||num==2) return true;

        for(int i=2;i<num;i++){
            if (num%i==0) return false;
        }
        return true;
    }


    static void printPrime(int n){
        for(int i=1;i<=n;i++){
            boolean res=isPrime(i);
            if (res==true)
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.print("Ente number: ");
        num=sc.nextInt();
        

        printPrime(num);
   





    }
}