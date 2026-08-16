/*5       4       3       2       1
        9       8       7       6
                12      11      10
                        14      13
                                15
                                */

public class ex5{
    public static void main(String args[]){
        int n=5;
        int cnt=5;
        for(int i=n;i>=1;i--){
            int c =cnt;
            for(int sp=i;sp<5;sp++){
                System.out.print("\t");
            }

            for(int j=i;j>=1;j--){
                System.out.print((char)(c+64)+"\t");
                c--;
            }
            System.out.println();
            cnt=cnt+i-1;
        }

    }
}