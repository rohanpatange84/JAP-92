/*
11111
12222
12333
12344
12345
*/
public class ex9{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=5;k>i;k--){
                     System.out.print(i);
                }
             System.out.println();
        }
    }
}