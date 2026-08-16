/*
1       2       4       7       11
        3       5       8       12
                6       9       13
                        10      14
                                15
                                
                                */
public class ex6{
    public static void main(String args[]){
        int n=5;
        int cnt=1;
        for(int i=1;i<=n;i++){
            int c = cnt;
            for(int sp=i;sp>1;sp--){
                System.out.print("\t");
            }


            for(int j=i;j<=n;j++){
                System.out.print(c+"\t");
                c=c+j;
            }
            System.out.println();
            cnt=cnt+i+1;
        }
    }
}