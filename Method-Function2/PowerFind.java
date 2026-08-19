import java.util.Scanner;
public class PowerFind{

    static int findPower(int num,int pow){
        int power=num;
        for(int i=pow;i<=1;i--){
            power=power*i;
        }
        return power;
    }


    public static void main(String args[]){
        int num;
        int pow;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        num= sc.nextInt();
        System.out.print("Enter power: ");
        pow =sc.nextInt();

        int powerofno=findPower(num,pow);
        System.out.println("The power is: "+powerofno);



        



        
    }
}