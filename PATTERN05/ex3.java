public class ex3{
    public static void main(String args[]){
        int n=5;
        for(int i=n;i>=1;i--){
            if(i<=n){
                for(int j=n;j>=i;j--){
                    System.out.print(i);
                }
                System.out.println();
              
            }
              else{
                for(int j=1;j<4;j--){
                    System.out.print(i);

                }
                   
                }
        }
    }
}