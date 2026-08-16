/*
*******
*  *  *
*  *  *
*******
*  *  *
*  *  *
*******
*/

public class ex3{
    public static void main(String args[]){
        int n=7;
        for(int i=1;i<=n;i++){
           if(i==1||i==4||i==7){
             for(int j=1;j<=n;j++){

                
                System.out.print("*");
            }
            System.out.println();
           }
           else{
            for(int j=1;j<=n;j++){
                if(j==2||j==3||j==5||j==6){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();


           }
        }
    }
}