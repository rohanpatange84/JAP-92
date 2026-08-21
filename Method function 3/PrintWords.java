import java.util.Scanner;
public class PrintWords{

    static void printNum(int num){
        String arr[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        String arr2[]={"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        if(num>=0&&num<=9){
            
           System.out.println(arr[num]);
        }

        if(num>=11&&num<=19){
         System.out.println(arr2[num]);
        }

        
    }
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");;
        num=sc.nextInt();

        printNum(num);

    }
}