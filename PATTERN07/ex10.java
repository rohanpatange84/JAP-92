/*
1       1
21     12
321   123
4321 1234
543212345
*/

public class ex10{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            if(i==5){
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
            }
            else{
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
                for(int sp=1;sp<=2*(n-i)-1;sp++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}