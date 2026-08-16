import java.util.Scanner;
public class ex4{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        n=sc.nextInt();
        int cnt=0;
        for(int i=1;i<=n;i++){
            cnt=cnt+i;
           
        }
         System.out.println(cnt);
        
    }
}