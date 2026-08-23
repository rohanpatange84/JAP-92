/*
   ****      ****
  ******    ******
 ********  ********
********************
 ******************
  ****************
   **************
    ************
     **********
      ********
       ******
        ****
         **
*/
public class heartpattern{
    public static void main(String args[]){
        int n=5;
        for(int i=2;i<=n;i++){
            for(int sp=n;sp>i;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
            System.out.print("*");

        }
          for(int j=1;j<=i;j++){
            System.out.print("*");

        }

         for(int sp=n;sp>i;sp--){
                System.out.print(" ");
            }
            for(int sp=n;sp>i;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
            System.out.print("*");

        }
          for(int j=1;j<=i;j++){
            System.out.print("*");

        }
        
        
        
        System.out.println();
    }
    for(int i=1;i<=9;i++){
        for(int sp=i;sp>=1;sp--){
            System.out.print(" ");
        }
        for(int j=1;j<=((n*2)*2)-i*2;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}