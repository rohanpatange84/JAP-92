/* Write a  program to enter the radius of a circle and find its diameter, circumference and area.*/


import java.util.Scanner;
public class Circle{

    static void findDiameterr(int radius){
        int diameter=radius*2;
        System.out.println("The diameter of circle is: "+diameter);
    }

    static void findCircumference(int radius){
        double circumference=2*(Math.PI)*radius;
        System.out.println("The circumference of circle: "+circumference);
    }

    static void findArea(int radius){
        double area=Math.PI*(radius*radius);
        System.out.println("The area of circle is: "+area);

    }
    public static void main(String args[]){
        int radius;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius=sc.nextInt();

        findDiameterr(radius);
        findCircumference(radius);
        findArea(radius);


    }
}