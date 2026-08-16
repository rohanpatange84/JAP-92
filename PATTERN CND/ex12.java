/*
54321
54322
54333
54444
55555
*/

public class ex12{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(j);
            }
            for(int x=i;x>1;x--){
                 System.out.print(i);
            }
             System.out.println();
        }
    }
}