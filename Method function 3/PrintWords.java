import java.util.Scanner;
public class PrintWords{

    static void printNum(int num){
        String arr[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String arr2[]={"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String arr3[]={"Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninghty","Hundred"};
        
        if(num>=0&&num<=9){
            
           System.out.println(arr[num]);
        }

        if(num>=11&&num<=19){
            num=num-11;
         System.out.println(arr2[num]);
        }

        if(num%10==0){
            if(num==100){
                System.out.println(arr3[9]);
            
            }
            else{
                 int rem=0;
            int temp=num;
            while(num>0){
                rem=num%10;
                num=num/10;
            }
            num=(rem-1+(rem*10))-temp;
         System.out.println(arr3[num]);
            }
        }

        if(num>=21&&num<=99){
            int rem=0;
            int last=num%10;
            while(num>0){
                rem=num%10;
                num=num/10;
            }
              System.out.print(arr3[rem-1]);
              System.out.print(" ");
              System.out.print(arr2[last-1]);

        }


        if(num>=101&&num<=109){
            int rem=0;
            int last=num%10;
            while(num>0){
                rem=num%10;
                num=num/10;
            }
             System.out.print(arr[rem]);
            System.out.print(" ");
             System.out.print(arr3[10-rem]);
              System.out.print(" ");
              
              System.out.print(arr[last]);

        }

        if(num>=110&&num<=119){
            int rem=0;
            int last=num%10;
            while(num>0){
                rem=num%10;
                num=num/10;

            }
            System.out.print(arr[rem]);
             System.out.print(" ");
              System.out.print(arr3[9]);
                 System.out.print(" ");
              System.out.print(arr2[last-1]);

        }

        
    }
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");;
        num=sc.nextInt();

        printNum(num);

    }
}