public class ex1{
    public static void main(String args[]){
        int n=5;
        int cnt=1;
        for(int i=n;i>=1;i--){
            int c = cnt;
            
             for(int sp=n;sp>i;sp--){
                System.out.print("\t");
            }
             for(int j=1;j<=i;j++){
                System.out.print(c+"\t");
                c++;
            }
            cnt= c;
            System.out.println();
        }
    }
}