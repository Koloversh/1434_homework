/*
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        FileReader reader = new FileReader("C://numbers.txt");
        Scanner scanner = new Scanner(reader);

        ArrayList<Integer> list = new ArrayList<>();

        int num;

        while (scanner.hasNext()) {
            num = Integer.parseInt(scanner.nextLine());
            
            if (num % 2 == 0) {
                list.add(num);
            }

        }
        
        reader.close(); // закрыл чтение
        Collections.sort(list); //
        System.out.println(list);

    }
}
