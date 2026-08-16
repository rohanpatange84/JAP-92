public class ex13{
    public static void main(String args[]){
        int n=5;
        for(int i=5;i>=1;i--){
           for(int sp = n;sp<i;sp--){
            System.out.print(" ");
           }


            for (int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}