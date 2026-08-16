/*12345
22345
33345
44445
55555
*/

public class ex15{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int x=i;x>1;x--){
                 System.out.print(i);
            }
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
             System.out.println();
        }
    }
}