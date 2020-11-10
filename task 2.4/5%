// Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = scanner.nextInt(); //сумма вклада
        int percent1 = scanner.nextInt(); // процент ежегодного начисления
        double sum2 = sum; // перевожу сумму вклада для расчёта с точкой
        double percent2 = ((percent1 * 1.0) / 100); // перевожу процент для расчёта с точкой
        int year = 5; // срок вклада

        for (int i = 0; i < year ; i++) {
            sum2 += sum2 * percent2;
            System.out.println(sum2);            
        }
        
    }
}
