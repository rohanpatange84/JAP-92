/*
 Write a  Java  program to input electricity unit charges and calculate total electricity bill according to the given condition:

    For first 50 units Rs. 0.50/unit

    For next 100 units Rs. 0.75/unit

    For next 100 units Rs. 1.20/unit

    For unit above 250 Rs. 1.50/unit

    An additional surcharge of 20% is added to the bill

*/
import java.util.Scanner;
public class ex7{
    public static void main (String args[]){
        int unit;
      
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter  unit :-");
        unit=sc.nextInt();

        double bill;
        if(unit<=50){

           bill=unit*0.50;
        }else if(unit<=150){
             bill=unit*0.70;
        }else if(unit>150 && unit<=250){
             bill=unit*1.23;

        }else{
            bill=unit*1.50;

        }

        System.out.print("Your Bill is :"+bill);
    }
}