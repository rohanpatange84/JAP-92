public class ex11{
    public static void main(String args[]){
        int n=5;
        for(int i=5;i>=1;i--){
            for (int sq=i;sq>1;sq--){
                System.out.print(" ");
            }
            for(int j =i;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}