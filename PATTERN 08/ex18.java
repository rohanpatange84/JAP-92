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

public class ex18{
    public static void main(String args[]){

        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i)
                System.out.print("*");
                else
                System.out.print(" ");

            }
            for(int sp=i;sp<(n*2-i);sp++){
                System.out.print(" ");
            }
             for(int j=1;j<=i;j++){
                if(j==1 || j==i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }

        //lower

         for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            for(int sp=i;sp<(n*2-i);sp++){
                System.out.print(" ");
            }
             for(int j=1;j<=i;j++){
                 if(j==1 || j==i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}