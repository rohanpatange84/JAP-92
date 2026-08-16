/*
1       1
22     22
333   333
4444 4444
555555555
*/
public class ex7{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            if(i==5){
                for(int j=1;j<=2*n-1;j++){
                System.out.print(i);
               }
            }
            else{
                for(int j=i;j>=1;j--){
                    System.out.print(i);
                }
                for(int sp=1;sp<=2*(n-i)-1;sp++){
                    System.out.print(" ");
                }
                for(int j=i;j>=1;j--){
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}