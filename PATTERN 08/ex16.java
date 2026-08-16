/*
AbCdEdCbA
bCdE EdCb
CdE   EdC
dE     Ed
E       E
dE     Ed
CdE   EdC
bCdE EdCb
AbCdEdCbA
*/
public class ex16{
    public static void main(String args[]){

        int n=5;
        for(int i=1;i<=n;i++){
            if(i==1){
                for(int j=i;j<=n;j++){
                    if(j%2==0)
                    System.out.print((char)(96+j));
                    else
                    System.out.print((char)(64+j));

                }
                for(int k=n-1;k>=1;k--){
                     if(k%2==0)
                    System.out.print((char)(96+k));
                    else
                    System.out.print((char)(64+k));
                }
                System.out.println();
            }
            else{

                for(int j=i;j<=n;j++){
                    if(j%2==0)
                    System.out.print((char)(96+j));
                    else
                    System.out.print((char)(64+j));
                }

                for(int sp=1;sp<=2*(i-1)-1;sp++){
                    System.out.print(" ");
                }

                for(int j=n;j>=i;j--){
                    if(j%2==0)
                    System.out.print((char)(96+j));
                    else
                    System.out.print((char)(64+j));
                }
                System.out.println();
            }
        }

        //lower
        
        for(int i=n-1;i>=1;i--){
            if(i==1){
                for(int j=i;j<=n;j++){
                     if(j%2==0)
                    System.out.print((char)(96+j));
                    else
                    System.out.print((char)(64+j));
                }
                for(int k=n-1;k>=1;k--){
                    if(k%2==0)
                    System.out.print((char)(96+k));
                    else
                    System.out.print((char)(64+k));
                }
                System.out.println();
            }
            else{

                for(int j=i;j<=n;j++){
                    if(j%2==0)
                    System.out.print((char)(96+j));
                    else
                    System.out.print((char)(64+j));
                }

                for(int sp=1;sp<=2*(i-1)-1;sp++){
                    System.out.print(" ");
                }

                for(int j=n;j>=i;j--){
                     if(j%2==0)
                    System.out.print((char)(96+j));
                    else
                    System.out.print((char)(64+j));
                }
                System.out.println();
            }
        }

    }
}