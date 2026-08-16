public class ex10{
    public static void main(String args[]){
        int n=5;
        int cnt=11;
        for(int i=n;i>=1;i--){
            int c = cnt;
            for(int j=i;j<=n;j++){
                System.out.print(c+"\t");
                c=c+j+1;
            }
            cnt = cnt-i+1;
            System.out.println();
        }
    }
}