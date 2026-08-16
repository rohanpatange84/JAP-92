public class ex12{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=5;i++){
            for (int sq=i;sq<5;sq++){
                System.out.print(" ");
            }


            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}