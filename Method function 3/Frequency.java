import java.util.Scanner;
public class Frequency{

    public static int findFrequency(int num){
        int rem;
        int cnt=1;
        int n;
        while(num>0){
            rem=num%10;
            num=num/10;
            if(rem==num%10){
                
                cnt++;
            }
            
        }
        return cnt;
    }


    public static void main(String args[]){
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number: ");
        num=sc.nextInt();

        int result=findFrequency(num);
        System.out.println(result);


    }
}