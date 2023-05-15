import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        int number = new Scanner(System.in).nextInt();
        int number2 = new Scanner(System.in).nextInt();

        int summ = number + number2;
        int diff = number - number2;
        int multt = number * number2;
        double divv = (double)number / number2;
        System.out.println("Сумма чисел = " + summ);
        System.out.println("Разность чисел = " + diff);
        System.out.println("Умножение чисел = " + multt);
        System.out.println("Частное от деления чисел = " + divv);

    }
}