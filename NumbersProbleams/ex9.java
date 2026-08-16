public class ex9{
    public static void main (String args[]){

        int n=5;
        for(int i=1;i<=n;i++){
            if(i==5){
                for(int j=1;j<=n*2-1;j++){
                    System.out.print("*");
                }
                
            }
            else{


                for(int j=1;j<=i;j++){
                    
                    System.out.print("*");
                }


                for(int sp=1;sp<=2*(n-i)-1;sp++){
                    System.out.print("-");
                }

                
                for(int k=1;k<=i;k++){
                     System.out.print("*");

                }
                System.out.println();
            }
        }
    }
}