public class ex4{
    public static void main(String args[]){
        int n=5;
        int cnt1=15;
        int cnt2=5;
        for(int i=n;i>=1;i--){
            for(int sp=i;sp>1;sp--){
                System.out.print("\t");
            }
            int c1=cnt1;
            int c2=cnt2;
            
            for(int j1=i,j2=i;j1<=n;j1++,j2++){
                System.out.print((char)(c2+64));
                 System.out.print((char)(c1+64)+"\t");
                c2 =c2-j2-1;
                c1=c1+j1;
            }
            cnt1 = cnt1-i;
            cnt2 =cnt2+i-1;
            System.out.println();
        }
    }
}