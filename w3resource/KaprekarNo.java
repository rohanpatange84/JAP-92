public class KaprekarNo{
    public static void main(String args[]){
        int sqr=0;
        for(int i=1;i<=10;i++){
            sqr=i*i;
           if (num>=10){

            
            int ans=sqr;

             int sum=0;
                while(sqr>0){
                    sum=sum+(sqr%10);
                    sqr=sqr/10;
                }
            
            if(i==sum){
               
                

                System.out.print(i);
                System.out.println(sum);
            }
           }else if(num>=10&&num<=100)

           int cnt=0;
           int sum=0;
           while(sqr>0){
            cnt++;
            sum=sum*10+(sqr%10);
            sqr=sqr/10;

           }
           System.out.print(sum)


            

        }

    }
}