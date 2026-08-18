/*Write a  program to enter two angles of a triangle and find the third angle.*/

import java.util.Scanner;
public class FindAngle{

    static void findAngle(int angle1,int angle2){
        int angle3=180-(angle1+angle2);
        System.out.println("The third angle is: "+angle3);

    }

    public static void main(String args[]){
        int angle1;
        int angle2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle 1: ");
        angle1= sc.nextInt();
        System.out.print("Enter angle 2: ");
        angle2= sc.nextInt();

        findAngle(angle1,angle2);

        
    }
}