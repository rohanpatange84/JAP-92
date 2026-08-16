public class ex3{
    public static void main(String args[]){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int sp=1;sp<i;sp++){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--){
                System.out.print(j);
            }
            for(int k=i;k<n;k++){
                System.out.print(k+1);
            }
            System.out.println();
        }
    }
}