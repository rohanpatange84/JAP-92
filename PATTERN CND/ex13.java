/*
55555
54444
54333
54322
54321
*/
public class ex13{
    public static void main(String args[]){
        int n=5;
        for(int i=n;i>=1;i--){
            int y=n;
            for(int x=i;x<n;x++){
                 System.out.print(y);
                 y--;    
            }
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
             System.out.println();
        }
    }
}