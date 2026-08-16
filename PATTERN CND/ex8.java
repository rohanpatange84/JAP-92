/*
12345
12344
12333
12222
11111
*/
public class ex8{
    public static void main(String args[]){
        int n=5;
        for (int i=n;i>=1;i--){
            for(int x=1;x<i;x++){
                 System.out.print(x);

            }

            for(int j=n;j>=i;j--){
                System.out.print(i);
            }
             System.out.println();
        }

    }
}