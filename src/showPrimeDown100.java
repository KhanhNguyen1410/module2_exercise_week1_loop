import java.util.Scanner;

public class showPrimeDown100 {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
        int N = 2;
        while (N < 100){
                if (checkPrime(N)){
                    System.out.println(N);
                } N++;
        }
    }
    static boolean checkPrime(int number){
        if (number < 2){
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0){
                return false;
            }
        } return true;
    }
}
