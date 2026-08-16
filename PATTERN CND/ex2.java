/*
AAAAA
bbbbb
CCCCC
ddddd
EEEEE
*/
public class ex2{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i%2==1){
                    System.out.print((char)(i+64));
                }
                else{
                    System.out.print((char)(i+96));
                }
            }
             System.out.println();
        }
    }
}