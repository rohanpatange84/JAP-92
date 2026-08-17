import java.util.Scanner;
public class ex1{
    public static void main(String args[]){
        int num;
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number:");
        num=sc.nextInt();
        System.out.println("Enter the value Accouding to your task:");
        System.out.println("1 For Digit Status");
        System.out.println("2 For Boundry Sum");
        System.out.println("3 FOr Calculate sum and prodict of digit");
        System.out.println("4 For Check Palindrome or not");
        System.out.println("5 For Find the fractional of umber");
        n=sc.nextInt();

        switch (n){
            case 1 :
                int cnt=0;
                while(num>0){
                    num=num/10;
                    cnt++;
                }
                System.out.println("Total number is "+cnt);
                break;

            case 2:
                int firstdigit=num%10;
                int rem1=0;
                while(num>0){
                    rem1=num%10;
                    num=num/10;
                }
                int result = firstdigit+rem1;
                System.out.print("Sum of first and last digit is:"+result);
                break;

            case 3:
                int sum=0;
                int mul=1;
                int rem=0;
                while(num>0){
                    rem=num%10;
                    
                    sum=sum+rem;
                    mul = mul*rem;
                    num=num/10;
                }
                System.out.println("the sum of num is"+sum+"and product is"+mul);

            case 4:
                int temp=num;
                int newnum=0;
                int rem4 = 1;
                while(num>0){

                    rem4=num%10;
                    newnum=newnum*10+rem4;
                    num=num/10;

                }
                String msg =(temp==newnum)?"number is palindrome":"Number is not Palindrome";
                System.out.println(msg);

            case 5:

                int result5=num;

                for(int i=num;i>1;i--){
                    result5=result5*(i-1);

                }
                System.out.println("The factorial is:"+result5);

                for(int i=1;i<=num;i++){
                    if(num%i==0){
                        System.out.println(i);
                    }
                   
                }
                default:
                    System.out.println("Invalid input");
                    break;


          


        }
        


    }
}