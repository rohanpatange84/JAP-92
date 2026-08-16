public class ex5{
    public static void main (String args[]){

        int n=5;
        for(int i=n;i>=1;i--){
            if(i>=1){
                for(int j=i;j<=n;j++){
                   System.out.print(i); 
                }
                System.out.println();
            }
            else{
                for(int j=n-1;j<=9;j++){
                    System.out.print(i); 

                }
                  System.out.println();

            }
        }
    }

}