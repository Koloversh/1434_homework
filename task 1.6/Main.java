/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int enter = sc.nextInt();
        double percent = (((15 * 1.0) / 100) * enter) + enter;

        System.out.println(percent);

    }
}
