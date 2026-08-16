/*
O       M       J       F       A
N       K       G       B
L       H       C
I       D
E
*/

public class ex2{
    public static void main(String args[]){
        int n=5;
        int cnt=15;
        for(int i=1;i<=n;i++){
            int c =cnt;
            for(int j=i;j<=n;j++){
                System.out.print((char)(64+c)+"\t");
                c=c-j-1;
            }
            System.out.println();
            cnt =cnt-i;
        }
    }
}