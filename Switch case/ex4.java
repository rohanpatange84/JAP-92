import java.util.Scanner;
public class ex4{
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        System.out.println("1. Right Angle Triangle Solid");
        System.out.println("2. Mirrored Right Triangle");
        System.out.println("3. Inverted Right Triangle");
        System.out.println("4. Inverted Mirrored Triangle");
        num=sc.nextInt();
        int n=5;

        switch(num){
            case 1:
                System.out.println("Solid");
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }

                System.out.println("Hollow");
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=i;j++){
                        if(i==n||j==1||j==i)
                        System.out.print("*");
                        else
                        System.out.print(" ");
                    }
                    System.out.println();
                }



                break;
            
            case 2:
                System.out.println("Solid");
                for(int i=1;i<=n;i++){
                    for(int sp=n;sp>i;sp--){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }

                System.out.println("Hollow");
                for(int i=1;i<=n;i++){
                    for(int sp=n;sp>i;sp--){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i;j++){
                        if(i==n||j==1||j==i)
                        System.out.print("*");
                        else
                        System.out.print(" ");
                    }
                    System.out.println();
                }

                break;

            case 3:
                System.out.println("Solid");
                for(int i=1;i<=n;i++){
                    for(int j=n;j>=i;j--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println("Hollow");
                for(int i=1;i<=n;i++){
                    for(int j=n;j>=i;j--){
                        if(i==1||j==n||j==i)
                        System.out.print("*");
                        else
                        System.out.print(" ");
                    }
                    System.out.println();
                }             

                break;

            case 4:
                System.out.println("Solid");
                for(int i=1;i<=n;i++){
                    for(int sp=i;sp>1;sp--){
                        System.out.print(" ");
                    }
                    for(int j=n;j>=i;j--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
              
                System.out.println("Hallow");
                 for(int i=1;i<=n;i++){
                    for(int sp=i;sp>1;sp--){
                        System.out.print(" ");
                    }
                    for(int j=n;j>=i;j--){
                         if(i==1||j==n||j==i)
                        System.out.print("*");
                        else
                        System.out.print(" ");
                    }
                    System.out.println();
                }

                break;

            default :
                System.out.println("Invalid input");



        }
    }
}