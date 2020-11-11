/*Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
... */

public class Main {
    public static void main(String[] args) {
        
        int i = 1;
        while (i < 11){
            System.out.print(i + " ");
            int j = 2;
            while (j < 11){
                int scale = i*j;
                if (scale < 11){
                    System.out.print(scale + " ");
                } else {
                    System.out.print(scale + " ");
                }
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
