public class ex7{
    public static void main(String args[]){
        int n=5;
        int cnt1=5;
        int cnt2=1;
        for(int i1=n,i2=1;i1>=i1;i1--,i2++){
            int c1=cnt1;
            int c2=cnt2;

            for(int j1=i1,j2=i2;j1>=1;j1--,j2++){
                System.out.print(c1+"\t");
                System.out.print(c2+"\t");
                c1=c1-1;
                c2=c2-j2;

            }
            System.out.println();
            cnt1=cnt1+i1-1;
            cnt2=cnt2+i2+1;
        }
    }
}