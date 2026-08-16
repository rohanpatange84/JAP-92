/*                              11
                        12      7
                13      8       4
        14      9       5       2
15      10      6       3       1
*/

public class ex4{
    public static void main(String args[]){
        int n=5;
        int cnt=11;
        for(int i=n;i>=1;i--){
            int c=cnt;
            for(int sp=i;sp>1;sp--){
                System.out.print("\t");
            }


            for(int j=n;j>=i;j--){
                System.out.print(c+"\t");
                c=c-j;
            }
            System.out.println();
            cnt++;

        }
    }
}