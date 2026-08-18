/*Write a  program to enter length in centimetres and convert it into meter and kilometer.*/


import java.util.Scanner;
public class LengthConveter{

    static void convertToMeter(int length){
        double meter =length/100.0; 
        System.out.println(length+" cm is equal to "+meter+" m");

    }

    static void convertToKilometer(int length){
        double kilometer=length/100000.0;
        System.out.println(length+" cm is equal to "+kilometer+" km");

    }

    public static void main(String args[]){
        int length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght in centimeter: ");
        length=sc.nextInt();

        convertToMeter(length);
        convertToKilometer(length);

    }
}