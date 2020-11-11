// Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.

public class Main {
    public static void main(String[] args) {

        int [] array = {6, 7, 5, 20, 7,  3, 8};
        String alarm = "Нет!";

        for (int i = 0; i < array.length ; i++) {
            if (array[i] == 5){
                alarm = "Da!";
                break;
            }
        }
        System.out.println(alarm);

        
        
        
    }
}
