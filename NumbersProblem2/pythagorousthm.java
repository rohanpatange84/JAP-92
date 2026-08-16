import java.util.*;

public class pythagorousthm{
    public static void main(String args[]){
        int Hypotenous;
        int FirstSide;
        int SecondSide;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 if find Hypotenous or enter 2 for finding any side :-");
        n=sc.nextInt();

        if(n==1){
            
        System.out.print("Enter first side:");
        FirstSide =sc.nextInt();
        System.out.print("Enter Second side:");
        SecondSide=sc.nextInt();
        
        // Hypotenous=sc.nextInt();
       
        int Answer1=(FirstSide*FirstSide)+(SecondSide*SecondSide);
        double Answer2=Math.sqrt(Answer1);

        System.out.print("Hypotenous is:"+Answer2);

        }else{
            

        System.out.print("Enter side :-");
        FirstSide =sc.nextInt();
         System.out.print("Enter Hypotenous:");
         Hypotenous=sc.nextInt();

         int Answer1=FirstSide*FirstSide;
         int Answer2=(Hypotenous*Hypotenous)-Answer1;
         double Answer3=Math.sqrt(Answer2);

         System.out.print("Another side is"+Answer3);


        





        }

    }
}