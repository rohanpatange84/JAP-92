

import java.util.Scanner;
public class Average{

    static void findTotal(int sub1,int sub2,int sub3,int sub4,int sub5){
        int total = sub1+sub2+sub3+sub4+sub5;
        System.out.println("The total is: "+total);

        findAverage(total);
        findPercentage(total);

    }

    static void findAverage(int total){
        double average=total/5;
        System.out.println("The average is: "+average);

       
        

    }

    static void findPercentage(int total){
        double percentage = (total/500.0)*100;
        System.out.println("The percentage is: "+percentage);
       
    }


    public static void main(String args[]){
        int sub1,sub2,sub3,sub4,sub5;

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter sub1 mark: ");
        sub1= sc.nextInt();

         System.out.print("Enter sub2 mark: ");
        sub2= sc.nextInt();

         System.out.print("Enter sub3 mark: ");
        sub3= sc.nextInt();

         System.out.print("Enter sub1 mark: ");
        sub4= sc.nextInt();

         System.out.print("Enter sub1 mark: ");
        sub5= sc.nextInt();

        findTotal(sub1,sub2,sub3,sub4,sub5);
      

        
    }

}