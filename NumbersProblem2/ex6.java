//   Write a  Java  program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:

//     Percentage >= 90% : Grade A

//     Percentage >= 80% : Grade B

//     Percentage >= 70% : Grade C

//     Percentage >= 60% : Grade D

//     Percentage >= 40% : Grade E

//     Percentage < 40% : Grade F

   

import java.util.*;
public class ex6{
    public static void main(String args[]){
        int Physics;
        int Chemistry;
        int Biology;
        int Mathematics;
        int Computer;
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter Physics mark :-");
        Physics=sc.nextInt();

        System.out.print("Enter Chemistry mark :-");
        Chemistry=sc.nextInt();

        System.out.print("Enter Biology mark :-");
        Biology=sc.nextInt();

        System.out.print("Enter Mathematics mark :-");
        Mathematics=sc.nextInt();

        System.out.print("Enter Computer mark :-");
        Computer=sc.nextInt();

        if(Physics>100||Chemistry>100||Biology>100||Mathematics>100||Computer>100){
            System.out.print("Enter a valid mark");
            
        }else{


        int percentage=(Physics+Chemistry+Biology+Mathematics+Computer)/5;

        if(percentage>=90){
            System.out.print("Your Percentage is "+percentage+ " and Grade A");
        }else if(percentage>=80){
            System.out.print("Your Percentage is "+percentage+ " and Grade B");
        }else if(percentage>=70){
            System.out.print("Your Percentage is "+percentage+ " and Grade C");
        }else if(percentage>=60){
            System.out.print("Your Percentage is "+percentage+ " and Grade D");
        }else if(percentage>=40){
            System.out.print("Your Percentage is "+percentage+ " and Grade E");
        }else{
            System.out.print("Your Percentage is "+percentage+ " and Grade F");
        }
        }
    }
}