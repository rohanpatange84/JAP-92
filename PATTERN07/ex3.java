/*
123454321
1234 4321
123   321
12     21
1       1
*/

public class ex3{
    public static void main(String args[]){
        int n=5;
        for(int i=n;i>=1;i--){
            if(i==n){
                for(int j=1;j<=n;j++){
                    System.out.print(j);
                }
                for(int j=n-1;j>=1;j--){
                    System.out.print(j);
                }
            }
            else{
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                for(int sp=1;sp<=2*(n-i)-1;sp++){
                    System.out.print(" ");
                }
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}