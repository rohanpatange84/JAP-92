import java.util.Scanner;
public class CheckPerfectNumbers{


    static void checkperfert(int n){

        for(int j=1;j<=n;j++){

        int sum=0;
        for(int i=1;i<j;i++){
            if(j%i==0){
                sum=sum+i;
            }
        }
        if(j==sum)
            System.out.println(j);
        
        

        }

    }
    public static void main(String arrgs[]){
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number: ");
        n=sc.nextInt();

        checkperfert(n);
    }
}