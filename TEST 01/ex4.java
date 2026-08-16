public class ex4{
    public static void main(String args[]){
        int n=5;
        for(int i=n;i>=1;i--){
            if(i==1){
                for(int j=i;j<=n;j++){
                    for(int k=j;k>=1;k--){
                        if(j%2==1||k%2==1){
                        System.out.print((char)(64+k));
                        }else{
                             System.out.print((char)(96+k));

                        }
                    }
                    System.out.println();
                }
            }
            else{
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}