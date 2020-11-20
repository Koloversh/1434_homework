/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */

import java.util.ArrayList;
import java.util.Scanner;

/*
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> citiesList = new ArrayList<>();
        ArrayList<String> familyList = new ArrayList<>();

        while (true) {
            String city = scanner.nextLine();

            if (city.isEmpty()) {
                break;
            }

            String family = scanner.nextLine();

            citiesList.add(city);
            familyList.add(family);
        }

//        System.out.println( citiesList + " " + familyList);
        // Где и кто живёт
        String search = scanner.nextLine();
        for (int i = 0; i < citiesList.size() ; i++) {
            if (search.equals(citiesList.get(i))) {
                System.out.println(familyList.get(i));
            }
        }
//        int houseNumber = Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i < citiesList.size() ; i++) {
//            if ( houseNumber == i) {
//                System.out.println(familyList.get(i));
//            }
        }
        
    }
}
