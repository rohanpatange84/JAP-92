/*Print all ASCII characters with their values*/

import java.util.Scanner;
public class ASCII{

    static void findAsscii(int num){
        if(num>=48&&num<=57){
            System.out.println((char)(num));
        }else if(num>=65&&num<=90){
            System.out.println((char)(num));

        }else if(num>=97&&num<=122){
            System.out.println((char)(num));
        }else{
             System.out.println("Invalid input");
        }
    }

    public static void main(String args[]){
        int value;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter value: ");
        value=sc.nextInt();

        findAsscii(value);



        
    }
}