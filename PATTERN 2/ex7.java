public class ex7{
    public static void main(String args[]){
       int n=5;
       int cnt =11;
       for(int i=n;i>=1;i--){
        int c =cnt;
        for(int j=n;j>=i;j--){
            System.out.print(c+"\t");
            c=c-j;
        }
        cnt++;
        System.out.println();
        }
    }
}