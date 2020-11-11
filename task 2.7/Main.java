/*
Задание: Дано число, например 31. Проверьте, что это число не делится ни на одно другое число кроме себя самого и единицы.
То есть в нашем случае нужно проверить, что число 31 не делится на все числа от 2 до 30. Если число не делится - выведите 'false',
а если делится - выведите 'true'.
*/

public class Main {
    public static void main(String[] args) {

        int digit = 31;
        String ans1 = "False.";
        String ans2 = "True!";

        for (int i = 2; i < digit; i++) {
            if (digit % i == 0) {
                ans1 = ans2;
                break;
            }
        }    
        System.out.println(ans1);
    }
}
