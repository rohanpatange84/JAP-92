public class ex3{
    public static void main(String args[]){
        int n=5;
        int cnt=5;
        for(int i=n;i>=1;i--){
            int c = cnt;
            for(int j=i;j<=n;j++){
                System.out.print(c+"\t");
                c =c-j-1;
            }
            System.out.println();
            cnt =cnt+i-1;
        }
    }
}