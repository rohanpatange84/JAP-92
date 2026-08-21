import java.util.Scanner;
public class Frequency{


    static int findFrequency(int num,int digit){
        int cnt=0;
        while(num>0){
           int x= num%10;
           if (x==digit) cnt++;
            num=num/10;
        }
        return cnt;
    }



    public static void main(String args[]){
        int num;
        int digit;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        num=sc.nextInt();
        System.out.print("Enter a digit: ");
        digit=sc.nextInt();

        int result=findFrequency(num,digit);
        System.out.println(result);



       

    }
}