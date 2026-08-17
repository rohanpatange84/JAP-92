/*
*******
*      *
*      *
*      *
*******
*      *
*      *
*      *
*******
*/

public class B{
    public static void main(String args[]){
        int n=9;
        float div =n/2f;
        long mid = Math.round(div);
        for(int i=1;i<=n;i++){
            if(i==1||i==mid||i==n){
                for(int j=1;j<=n-1;j++){

                   System.out.print("*");
                } 
                System.out.println();
                }else{
            for(int j=1;j<=n;j++){
                

                if(j==1||j==n)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
                }
            
        }
    }
}


