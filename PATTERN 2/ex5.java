public class ex5{
    public static void main(String args[]){
        int n=5;
        int x=15;
        for(int i=1;i<=5;i++){
            int  count=x;
            for(int j=1;j<=i;j++){
                 System.out.print(count+" ");
                 count++;
            }
          count=(count-1)-i;
             System.out.println();
        }
    }
}