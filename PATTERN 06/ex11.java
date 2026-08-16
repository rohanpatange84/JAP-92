/*
    *
   * *
  * * *
 * * * *
* * * * *
*/

public class ex11{
   public static void main(String args[]){
        int n=5;
        for(int i=1;i<=5;i++){
            for(int sp=n;sp>i;sp--){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++){
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