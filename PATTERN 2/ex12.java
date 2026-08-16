public class ex12{
    public static void main(String args[]){
        int n=5;
        int cnt= 5;
        for(int i=n;i>=1;i--){
            int c =cnt;
            for(int j=n;j>=i;j--){
                System.out.print(c+"\t");
                    c=c+j;
            
            }
             System.out.println();
                cnt--;
        }
    }
}