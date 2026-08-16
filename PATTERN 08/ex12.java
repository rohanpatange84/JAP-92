public class ex12{
    public static void main (String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
            if(j==1||j==n){
                System.out.print("*");

            }else if(i==2||i==3||i==4){
                if(j==4||j==3||j==2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            else{
               
                System.out.print(" ");
            }
            }
            System.out.println();
        }
        

    }
}