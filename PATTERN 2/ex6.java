public class ex6{
    public static void main(String args[]){
        int n=5;
        int cnt=15;
        for(int i=n;i>=1;i--){
            int c= cnt;
            for(int j=n;j>=i;j--){
                System.out.print(c+"\t");
                c=c-j+1;
            }
            cnt--;
            System.out.println();

        }
    }
}