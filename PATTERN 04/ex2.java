public class ex2{
    public static void main(String args[]){
        int n=5;
        int cnt=15;
        int cnt2=5;
        for(int i=n;i>=1;i--){
            for(int sp=i;sp>1;sp--){
                System.out.print("\t");
            }
            int c=cnt;
            
            for(int j=i;j<=n;j++){
                System.out.print(c+"\t");
                c=c+j;
            }
            cnt = cnt-i;
            System.out.println("");
        }
    }
}