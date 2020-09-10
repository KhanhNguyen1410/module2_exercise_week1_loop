import java.util.Scanner;

public class interestBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first money");
        double money = sc.nextInt();
        System.out.println("enter your interest");
        float interest = sc.nextFloat();
        System.out.println("enter your month");
        int month = sc.nextInt();
        double total_moneyInterest = 0;
        for (int i = 0; i < month; i++) {
            total_moneyInterest += money * (interest/100)/12 * month;
        }
        System.out.println(total_moneyInterest+ " is final money");

    }
}
