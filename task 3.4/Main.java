/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если их сумма больше 10 - пусть функция вернет true, а если нет - false.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(returnAnswer(a, b));
    }

    public static boolean returnAnswer(int a, int b) {

        if ((a + b) >= 10) {
            return true;
        } else {
            return false;
        }
    }
}
