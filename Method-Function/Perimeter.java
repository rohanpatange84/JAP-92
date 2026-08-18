/* Write a  program to enter the length and breadth of a rectangle and find its perimeter.*/

import java.util.Scanner;
public class Perimeter{

    static void Perimeter(int x,int y){
        int z=2*(x+y);
        System.out.println("Perimeter of recatangle is: "+z);
    }

    public static void main(String args[]){
        int lenght;
        int breadth;
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter lenght: ");
        lenght=sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth=sc.nextInt();

        Perimeter(lenght,breadth);
           
    }
}