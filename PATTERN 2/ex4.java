public class ex4{
    public static void main(String args[]){
        int n=5;
        int x=1;
     
        for(int i=1;i<=5;i++){
           
               int count=x;
            for(int j=1;j<=i;j++){
                 System.out.print(count +" ");
                 count--;
            }
            x =  x+i+1;
             System.out.println();
             
        }
    }

}