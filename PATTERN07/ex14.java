public class ex14{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=2*n-1;i++){
            if(i<=n){
            if(i==1){
                for(int j=1;j<=2*n-1;j++){
                    System.out.print(i);
                }
            }
            else{
                for(int j=i;j<=n;j++){
                    System.out.print(i);
                }
                for(int sp=1;sp<=2*(i-1)-1;sp++){
                    System.out.print(" ");
                }
                for(int j=i;j<=n;j++){
                    System.out.print(i);  
                }
            }
           
        }
        else{
            for(int j=2*n-i;j<=2*n-i+2;j++){
                System.out.print(2*n-i);
            }
            for(int sp=1;sp<=(i-1)-1;sp++){
                System.out.print(" ");
            }
             for(int j=2*n-i;j<=2*n-i+2;j++){
                System.out.print(2*n-i);
            }
            
        }
        System.out.println();
        }
    }
}