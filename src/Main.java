import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double userBalance = 100;
        Scanner scan = new Scanner(System.in);
        System.out.print("Заполните поле начального баланса: ");
        double income = scan.nextDouble();
        int bonus;
        if (income > 1000) {
            bonus = (int) income / 100;
        } else {
            bonus = 0;
        }

        userBalance += income + bonus;

        System.out.print("Бонус: ");
        System.out.println(bonus);
        System.out.print("Баланс: ");
        System.out.println(userBalance);
    }

}