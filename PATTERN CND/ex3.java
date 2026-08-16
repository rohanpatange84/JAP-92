/*
EEEEE
ddddd
CCCCC
bbbbb
AAAAA
 */
public class ex3{
    public static void main(String args[]){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=5;j++){
                if(i%2==1){
                    System.out.print((char)(64+i));
                }
                else{
                    System.out.print((char)(96+i));
                }
            }
             System.out.println();
        }
    }
}