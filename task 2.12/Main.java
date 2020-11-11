/*
ВНИМАНИЕ эта задача для ДЗ и не является обязательной.
Задание: 1. Создай массив чисел.
2. Добавь в массив 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
*/
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] array = new int[10];
        for (int i = 0; i < array.length ; i++) {
            array[i] = scanner.nextInt();
        }

        Integer currentValue = array[0];
        int count = 0;
        int max_count = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] == currentValue){
                count++;
            } else {

                if(count > max_count){
                    max_count = count;
                }

                currentValue = array[i];
                count = 1;
            }
        }
        if(count > max_count){
            max_count = count;
        }

        System.out.println(max_count);
    }
}
