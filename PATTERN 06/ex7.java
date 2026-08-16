public class ex7{
    public static void main(String args[]){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int sp=i;sp>1;sp--){
                System.out.print(" ");
            }

            for(int j=i;j<=n;j++){

                System.out.print(j);
            }

            for(int j=n-1;j>=i;j--){
                System.out.print(j);
            }

            System.out.println();
            
        }
    }
}