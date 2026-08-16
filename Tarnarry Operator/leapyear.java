import java.util.Scanner;
public class leapyear{
    public static void main(String args[]){
        int year;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter year :");
        year = sc.nextInt();

        String msg =(year%100==0)?"Century leap year":(year%4==0 )?"leap year":"not a leap year";
        System.out.println(msg);
        
    }
}