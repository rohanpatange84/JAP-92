/*AbCdE
AbCdE
AbCdE
AbCdE
AbCdE
*/
public class ex4{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j%2==1){
                    System.out.print((char)(64+j));
                }
                else{
                     System.out.print((char)(96+j));
                }
            }
             System.out.println();
        }
    }
}