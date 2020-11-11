/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {

        int [] array = {2, 1, 3, 6, 3, 7, 8};
        boolean answer = false;

        for(int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                answer = true;
                break;
            }
        }

        if (answer) {
            System.out.println("Da");
        } else {
            System.out.println("HeT");
        }

    }
}
