 /* 
    1
   121
  12321
 1234321
123454321
*/

public class ex4{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int sp=i;sp<5;sp++){
                System.out.print(" ");
            }


            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i;j>1;j--){
                System.out.print(j-1);
            }
            System.out.println();
        }
    }
}