/*
111111111
2222 2222
333   333
44     44
5       5
*/

public class ex1{
    public static void main (String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            if(i==1){
                for(int j=1;j<=n*2-1;j++){
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
            System.out.println();
            
        }

    }
}