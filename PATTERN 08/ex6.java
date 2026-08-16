/*
*       *
 *     * 
  *   *  
   * *   
    * 
*/

public class ex6{
    public static void main(String args[]){
        int n=9;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=n;j++){
                if(j==n-i+1||j==i){
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