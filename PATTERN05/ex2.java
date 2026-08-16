public class ex2{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=2*n-1;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print(i);
                }
                System.out.println();
            }
            else{
                for(int j=i;j<=2*n-1;j++){
                     System.out.print(i);
                }
                System.out.println();
            }

        }
    }
}