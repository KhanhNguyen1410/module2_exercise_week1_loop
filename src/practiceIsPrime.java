import javax.swing.text.AbstractDocument;
import java.util.Scanner;

public class practiceIsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean result = true;

        if (number < 2){
            result = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++){
                    if (number % i == 0){
                        result = false;
                    } else result = true;
            }
        }
        if (result){
            System.out.println(number+ " is a prime");
        } else System.out.println(number+" is not prime");
    }
}
