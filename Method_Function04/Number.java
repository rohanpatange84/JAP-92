import java.util.Scanner;
public class Number{

    static int lastDigit(int num){
        return num%10;
    }

    static int secondLastDigit(int num){
        int cnt =2;
        int rem=0;
        while(cnt>=1){
        rem=num%10;
        num=num/10;
         cnt--;
        }
        return rem;
    }

    static int firstDigit(int num){
        int rem=0;
        while(num>0){
            rem=num%10;
            num=num/10;
        }
        return rem;
    }

     static int secondLastDigitLeft(int num){
        int rem=0;
        while(num>10){
            rem=num%10;
            num=num/10;
        }
        return rem;
    }

    static int sumOfDigit(int num){
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;

        }
        return sum;
    }

    static int count(int num){
        int cnt=0;
        while(num>0){
            cnt++;
            num=num/10;
        }
        return cnt;
    }
    static double averageOfDigit(int num){
        int cnt=count(num);

        return sumOfDigit(num)/cnt;
    }

    static int appendSumToLast(int num){
        int sum=sumOfDigit(num);
        int cnt=count(sum);
        int multiplxer=1;
        while (cnt>=1){
            cnt--;
            multiplxer=multiplxer*10;
        }
        return num*multiplxer+sum;
    }

     static int appendSumToFirst(int num){
        int cnt=count(num);
        int sum=sumOfDigit(num);
        
        int multiplxer=multiplxer(cnt);
    
        return sum*multiplxer+num;
    }

    static int multiplxer(int cnt){
        int multiplxer=1;
        while (cnt>1){
            cnt--;
            multiplxer=multiplxer*10;
        }
        return multiplxer;
    }

    static int shiftFirstToLast(int num){
        int cnt=count(num);
        int n1= num%multiplxer(cnt);
        int newnum=n1*10+firstDigit(num);
        return newnum;
    }

    static int shiftLastToFirst(int num){
        int cnt=1;
        int cnt2=count(num);
        int n1=lastDigit(num);
         while(cnt>=1){
            cnt--;
         num=num/10;
         }
         

         int newnum=n1*multiplxer(cnt2)+num;
         return newnum;
        
    }

    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        num=sc.nextInt();

        int lastdigit = lastDigit(num);
        int secondlastdigit =secondLastDigit(num);
        int firstdigit=firstDigit(num);
        int secondlastdigitleft=secondLastDigitLeft(num);
        int sumofdigit=sumOfDigit(num);
        double averageofdigit=averageOfDigit(num);
        int appendsumtolast=appendSumToLast(num);
        int appendsumtofirst=appendSumToFirst(num);
        int shiftfirsttolast=shiftFirstToLast(num);
        int shiftlasttofirst=shiftLastToFirst(num);

        System.out.println("Last digit of number is: "+lastdigit);
        System.out.println("Second last digit of number is: "+secondlastdigit);
        System.out.println("First digit of number is: "+firstdigit);
        System.out.println("Second digit from left of number is: "+secondlastdigitleft);
        System.out.println("Sum OF digit of number is: "+sumofdigit);
        System.out.println("Average of digit of number is: "+averageofdigit);
        System.out.println("After append sum to last number is: "+appendsumtolast);
        System.out.println("After append sum to first number is: "+appendsumtofirst);
        System.out.println("Shift First Digit to Last and number is: "+shiftfirsttolast);
        System.out.println("Shift Last Digit to First and number is: "+shiftlasttofirst);






    }
}