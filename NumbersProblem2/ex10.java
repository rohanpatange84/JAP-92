import java.util.Scanner;
public class ex10{
    public static void main(String args[]){
        int firstside;
        int secondside;
        int thirdside;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First side:");
        firstside=sc.nextInt();
        System.out.print("Enter Second side:");
        secondside=sc.nextInt();
        System.out.print("Enter Third side");
        thirdside=sc.nextInt();

        if(firstside==secondside&& secondside==thirdside){
            System.out.println("This is Equalitral Triangle");
        }else if(firstside==secondside||secondside==thirdside||firstside==thirdside){
             System.out.println("This is Isosceles Triangle");
        }
        else{
             System.out.println("This is Scalene Triangle");
        }

    }
}