import java.util.Scanner;
import java.util.*;
public class ex5{
    public static void main(String args[]){
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter input:-");
        c=sc.next().charAt(0);
        if(Character.isLetter(c)){
            System.out.println("It is Character.");
        }
        else{
            System.out.println("It is not Character.");
        }
        System.out.println(c);
    }
}