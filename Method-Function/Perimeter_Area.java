/* Write a  program to enter the length and breadth of a rectangle and find its perimeter.*/

/* Write a  program to enter the length and breadth of a rectangle and find its area.*/

import java.util.Scanner;
public class Perimeter_Area{

    static void perimeterOfRectangle(int x,int y){
        int z=2*(x+y);
        System.out.println("Perimeter of recatangle is: "+z);
    }

    static void areaOfRectangle(int x,int y){
        int z=x*y;
        System.out.println("Area of Rectangle is: "+z);
    }

    public static void main(String args[]){
        int length;
        int breadth;
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter lenght: ");
        length=sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth=sc.nextInt();

        perimeterOfRectangle(length,breadth);
        areaOfRectangle(length,breadth);


    }
}