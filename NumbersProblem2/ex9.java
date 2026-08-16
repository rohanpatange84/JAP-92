import java.util.Scanner;
public class ex9{
    public static void main(String args[]){
        int firstangle;
        int secondangle;
        int thirdangle;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First angle: ");
        firstangle=sc.nextInt();
        System.out.print("Enter Second angle: ");
        secondangle=sc.nextInt();
        System.out.print("Enter Third angle: ");
        thirdangle=sc.nextInt();

        if(firstangle+secondangle+thirdangle>=180 &&  firstangle+secondangle+thirdangle<=360){
            System.out.print("This is an angle ");

        }else{
            System.out.print("This is not angle");
        }

    }
}