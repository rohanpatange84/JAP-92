/*
                                1
                        2       3
                4       5       6
        7       8       9       10
11      12      13      14      15

*/ 

public class ex3{
    public static void main(String args[]){
        int n=5;
        int cnt=1;
        for(int i=1;i<=n;i++){
            int c =cnt;
            for(int sp=i;sp<5;sp++){
                System.out.print("\t");
            }
            for(int j=1;j<=i;j++){
                System.out.print(c+"\t");
                c++;
            }
            System.out.println();
            cnt =cnt+i;
        }
    }
}