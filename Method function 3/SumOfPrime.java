import java.util.Scanner;
public class SumOfPrime{


    static void findSum(int num){
      for(int i=1;i<=num;i++){
        System.out.println(i);

        for(int j=2;j<i;j++){
            if(i%j==0){
            System.out.println("Not Prime");
            System.out.println(i);
            break;
            }

        }
        System.out.println("Prime");
      }
         
    }
    public static void main(String args[]){
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number: ");
        num=sc.nextInt();

        findSum(num);

        
    }
}