/*Write a  program to enter the base and height of a triangle and find its area.*/


import java.util.Scanner;
public class AreaOfTriangle{

    static void areaOfTraingle(int base,int height){
        double area= 0.5*base*height;
        System.out.print("Area of a triangle is: "+area);
        
    }


    public static void main(String args[]){
        int  base;
        int height;
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter base: ");
        base = sc.nextInt();
        System.out.print("Enter height: ");
        height =sc.nextInt();

        areaOfTraingle(base,height);

        

    }
}