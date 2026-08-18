/*Write a  program to calculate the area of an equilateral triangle. */


import java.util.Scanner;
public class EquiTriangle{

    static void areaOfTraingle(int side){
        double area = Math.sqrt(3) / 4.0*(side*side);
        System.out.println("Area of Traiangle is: "+area);

    }

    public static void main(String args[]){
        int side;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of equilaterr triangle: ");
        side=sc.nextInt();

        areaOfTraingle(side);
    }
}