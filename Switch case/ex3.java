import java.util.Scanner;
public class ex3{
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        System.out.println("1 : Hollow Square");
        System.out.println("2 : Solid Rhombus");
        System.out.println("3 : Mirrored Rhombus");
        System.out.println("4 : Hollow Solid Rhombus");
        System.out.println("5 : Hollow Mirrored Rhombus");
        

        num =sc.nextInt();
        int n=5;

        switch(num){
            case 1:
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                if (i==1 || i==n|| j==1 ||j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
                }
                System.out.println();
            }
            break;

            case 2:

                for(int i=1;i<=n;i++){
                    for(int sp=i;sp<n;sp++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=n;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }

            case 3:

                 for(int i=1;i<=n;i++){
                    for(int sp=i;sp>1;sp--){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=n;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }

            case 4:

                 for(int i=1;i<=n;i++){
                    for(int sp=i;sp<n;sp++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=n;j++){
                       if (i==1 || i==n|| j==1 ||j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
                    }
                    System.out.println();
                }

            case 5:

                 for(int i=1;i<=n;i++){
                    for(int sp=i;sp>1;sp--){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=n;j++){
                        if (i==1 || i==n|| j==1 ||j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
                    }
                    System.out.println();
                }
                
        }
    }
}