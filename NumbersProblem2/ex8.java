import java.util.*;
public class ex8{
    public static void main(String args[]){
        int amount;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your amount:");
        amount=sc.nextInt();
        int cnt=0;

        while(amount>=2000){
            amount=amount-2000;
            cnt++;
        }
        int note2000=cnt;
        cnt = 0;

         while(amount>=500){
            amount=amount-500;
            cnt++;
        }
        int note500=cnt;
        cnt = 0;

         while(amount>=200){
            amount=amount-200;
            cnt++;
        }
        int note200=cnt;
        cnt = 0;
        

         while(amount>=100){
            amount=amount-100;
            cnt++;
        }
        int note100=cnt;
        cnt = 0;

         while(amount>=50){
            amount=amount-50;
            cnt++;
        }
        int note50=cnt;
        cnt = 0;


         while(amount>=20){
            amount=amount-20;
            cnt++;
        }
        int note20=cnt;
        cnt = 0;


         while(amount>=10){
            amount=amount-10;
            cnt++;
        }
        int note10=cnt;
        cnt = 0;

         while(amount>=5){
            amount=amount-5;
            cnt++;
        }
        int note5=cnt;
        cnt = 0;


           while(amount>=2){
            amount=amount-2;
            cnt++;
        }
        int note2=cnt;
        cnt = 0;

         while(amount>=1){
            amount=amount-1;
            cnt++;
        }
        int note1=cnt;
        cnt = 0;


        System.out.println("Notes    Count    Total");
        System.out.println("________________________");
        System.out.printf("%-5s  * %3d  = %7d ", "2000",note2000,(note2000*2000));
        System.out.println();
        System.out.printf("%-5s  * %3d  = %7d ", "500",note500,(note500*500));
        System.out.println();
        System.out.printf("%-5s  * %3d  = %7d ", "100",note100,(note100*100));
        System.out.println();
        System.out.printf("%-5s  * %3d  = %7d ", "50",note50,(note50*50));
        System.out.println();
        System.out.printf("%-5s  * %3d  = %7d ", "20",note20,(note20*20));
        System.out.println();
        System.out.printf("%-5s  * %3d  = %7d ", "10",note10,(note10*10));
        System.out.println();
        System.out.printf("%-5s  * %3d  = %7d ", "5",note5,(note5*5));
        System.out.println();
        System.out.printf("%-5s  * %3d  = %7d ", "2",note2,(note2*2));
        System.out.println();
        System.out.printf("%-5s  * %3d  = %7d ", "1",note1,(note1*1));
        System.out.println();
        System.out.println("________________________");
       
    
        

    }
}