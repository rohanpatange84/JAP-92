/*
*          *
**        **
***      ***
****    ****
*****  *****
************
*****  *****
****    ****
***      ***
**        **
*          *
*/

public class butterfly{
    public static void main(String args[]){

        int n=6;
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int sp=i;sp<(n*2-i);sp++){
                System.out.print(" ");
            }
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower

         for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int sp=i;sp<(n*2-i);sp++){
                System.out.print(" ");
            }
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}