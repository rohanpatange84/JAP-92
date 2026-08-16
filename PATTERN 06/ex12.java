/*
* * * * *
 * * * *
  * * *
   * *
    *
*/

public class ex12{
    public static void main(String args[]){
        int n=5;
        for(int i=5;i>=1;i--){
            for(int sp=i;sp<n;sp++){
                System.out.print(" ");
            }

            for(int j=2*i-1;j>=1;j--){
                if(j%2==1){
                    System.out.print("*");
                }
                else{
                     System.out.print(" ");

                }
            }

            System.out.println();
        }
    }
}