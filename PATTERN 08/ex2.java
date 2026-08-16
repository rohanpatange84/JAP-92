/*
*   *****
*   *    
*   *    
*   *    
*********
    *   *
    *   *
    *   *
*****   *
*/

public class ex2{
    public static void main(String args[]){
        int n=9;
        
        for(int i=1;i<=n;i++){
            if(i==5){
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }else if(i==1){
                
                for(int j=1;j<=n;j++){
                   if(j==2||j==3||j==4){
                    System.out.print(" ");
                   }else{
                     System.out.print("*");

                   }
                }
                System.out.println();



            }else if(i==n){
                
                for(int j=1;j<=n;j++){
                   if(j==6||j==7||j==8){
                    System.out.print(" ");
                   }else{
                     System.out.print("*");

                   }
                }
                System.out.println();



            }else if(i==n){
                
                for(int j=1;j<=n;j++){
                   if(j==6||j==7||j==8){
                    System.out.print(" ");
                   }else{
                     System.out.print("*");

                   }
                }
                System.out.println();



            }else if(i==n){
                
                for(int j=1;j<=n;j++){
                   if(j==6||j==7||j==8){
                    System.out.print(" ");
                   }else{
                     System.out.print("*");

                   }
                }
                System.out.println();



            }else if(i==n){
                
                for(int j=1;j<=n;j++){
                   if(j==6||j==7||j==8){
                    System.out.print(" ");
                   }else{
                     System.out.print("*");

                   }
                }
                System.out.println();



            }else if(i==2||i==3||i==4){
                
                for(int j=1;j<=n;j++){
                   if(j==5||j==1){
                    System.out.print("*");
                   }else{
                     System.out.print(" ");

                   }
                }
                System.out.println();



            }else if(i==6||i==7||i==8){
                
                for(int j=1;j<=n;j++){
                   if(j==5||j==n){
                    System.out.print("*");
                   }else{
                     System.out.print(" ");

                   }
                }
                System.out.println();



            }

            
            else{
                for(int j=1;j<=n;j++){
                    if(j==5){
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
}