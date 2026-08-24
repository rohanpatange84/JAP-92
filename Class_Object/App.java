import java.util.Scanner;
class Arithmatic{
    int num1;
    int num2;

     int doAdd(){
        return num1+num2;
    }

     int doSub(){
        return num1-num2;
    }
     int domul(){
        return num1*num2;
    }

     int doDiv(){
        return num1/num2;
    }

}

public class App{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
       
        Arithmatic oppe=new Arithmatic();
         System.out.print("Enter num1: ");
        oppe.num1=sc.nextInt();
        System.out.print("Enter num2: ");
        oppe.num2=sc.nextInt();

        System.out.print(oppe.doAdd());
        
    }
}