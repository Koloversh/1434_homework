/*
Задание: Дан массив с числами. Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/

public class Main {

    public static void array(int [] arr, int count) {
        if (count < arr.length) { // (count <= arr.length - 1)
            System.out.println(arr[count]);
            array(arr, count + 1);
            //return; - можно добавить, если убрать активный текст из строки 9 и раскомментить закомменченое.
        }
    }

    public static void main(String[] args) {
        int [] num = {4,2,6,2,65};
        int check = 0;
        array(num, check);
    }

}
