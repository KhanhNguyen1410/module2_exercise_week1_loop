import java.util.Scanner;

public class showShape {
    public static void main(String[] args) {
        System.out.println("1. Draw rectangle");
        System.out.println("2. Draw the square triangle");
        System.out.println("3. Draw the triangle");
        System.out.println("0. exit");
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0){
            System.out.println("enter your number choice");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println(" Draw rectangle");
                    for (int i = 1; i < 4; i++) {
                        for (int j = 1; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    } break;
                case 2:
                    System.out.println(" Draw the square triangle");
                    for (int i = 1; i <=5 ; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    for (int i = 5; i >=1 ; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    for(int i=1;i<=5;i++){
                        for(int j=1;j<=5;j++){
                            if(j<=5-i)
                                System.out.print(" ");
                            else
                                System.out.print("*");
                        }
                        System.out.println();
                    }
                    for(int i=5;i>=1;i--){
                        for(int j=1;j<=5;j++){
                            if(j<=5-i)
                                System.out.print(" ");
                            else
                                System.out.print("*");
                        }
                        System.out.println();
                    }

                    break;
                case 3:
                    System.out.println(" Draw the triangle");
                    for (int i = 1; i <= 5 ; i++) {
                        for (int j = 1; j <= 5-i ; j++) {
                            System.out.print(".");
                        }
                        for (int j = 1; j <= 2*i - 1 ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    
                    
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("no choice");

            }
        }
    }
}
