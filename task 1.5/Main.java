/* 
ВНИМАНИЕ! ДЛЯ РЕШЕНИЯ ЗАДАЧИ НЕОБХОДИМО ПРОСМОТРЕТЬ УРОК №4 https://www.youtube.com/watch?v=WmZ6kVTlWtg&list=PLOep0pi-UBExIxCNegkvCrBuDh0TE7Ihq&index=4
Программа запрашивает у пользователя значение в градусах Цельсия. Программа должена переводить температуру и выводить на экран
значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TF = (9 / 5) * TC + 32
Пример:
на вход подается значение 41.
Пример вывода:
105.8 */

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int celsNow = sc.nextInt();
        double db = 1.8;
        double TF = (db * celsNow) + 32;

        System.out.println(TF);
        
        //----------------------------
        // либо такой вариант
        
//        Scanner sc = new Scanner(System.in);
//        int celsNow = sc.nextInt();
//        double TF = (((1.0 * 9) / 5) * celsNow) + 32;
//
//        System.out.println(TF);

    }
}
