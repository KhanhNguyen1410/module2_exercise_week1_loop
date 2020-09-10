import java.util.Scanner;

public class UocChungMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = Math.abs(sc.nextInt());
        System.out.println("enter second number");
        int b = Math.abs(sc.nextInt());
        if (a == 0 && b == 0 ){
            System.out.println("no greatest common factor");
        }
        while (a != b){
            if (a > b ){
                a = a - b;
            } else b = b -a ;
        }
        System.out.println("greatest common factor; "+ a);

    }
}
