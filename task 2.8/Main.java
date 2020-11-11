//Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение элементов этого массива.

public class Main {
    public static void main(String[] args) {
        int [] array = {2, 3, 4, 5};
        int multArr = 1;

        for (int i = 0; i < array.length ; i++) {
            multArr = multArr * array[i];
        }
        System.out.println(multArr);
    }
}
