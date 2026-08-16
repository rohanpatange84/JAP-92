/*
    5
   545
  54345
 5432345
543212345
*/

public class ex6{
    public static void main(String args[]){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int sp=i;sp>1;sp--){
                System.out.print(" ");
            }

            for(int j=n;j>=i;j--){
                System.out.print(j);
            }
            for(int j=i;j<n;j++){
                System.out.print(j+1);

            }

            
            System.out.println();
        }
    }
}