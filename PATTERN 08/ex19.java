/*
*****     *****     *****
*****     *****     *****
*****     *****     *****
*****     *****     *****
*****     *****     *****

     *****     *****     
     *****     *****     
     *****     *****     
     *****     *****     
     *****     *****     

*****     *****     *****
*****     *****     *****
*****     *****     *****
*****     *****     *****
*****     *****     *****

     *****     *****     
     *****     *****     
     *****     *****     
     *****     *****     
     *****     *****     

*****     *****     *****
*****     *****     *****
*****     *****     *****
*****     *****     *****
*****     *****     *****
*/

public class ex19{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                for(int k=1;k<=n;k++){
                    if(i%2==0){
                    if(k%2==0)
                    for(int m=1;m<=n;m++){
                         System.out.print("*");
                    }
                    else
                    for(int m=1;m<=n;m++){
                         System.out.print(" ");
                    }
                    }
                    else{
                         if(k%2==0)
                    for(int m=1;m<=n;m++){
                         System.out.print(" ");
                    }
                    else
                    for(int m=1;m<=n;m++){
                         System.out.print("*");
                    }
                    }    
                }
                System.out.println();   
            } 
            System.out.println();
        }
    }
}