/*
Задание: Запросить у пользователя ввод числа и сохранить это число в переменную a.Если переменная a равна 10, то выведите 'Верно', иначе выведите 'Неверно'.
*/
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a != 10) {
            System.out.println("Неверно");
        } else {
            System.out.println("Верно");
        }
    }
}
