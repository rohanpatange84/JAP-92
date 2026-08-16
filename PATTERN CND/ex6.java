public class ex6{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i%2==1){
                    System.out.print("1");
                }
                else{
                    System.out.print((char)(64+i/2));
                }
            }
             System.out.println();
        }
    }
}