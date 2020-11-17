/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        ArrayList <Integer> numbers = new ArrayList();
        ArrayList <Integer> nextNumbers = new ArrayList();

        numbers.add(-1);
        numbers.add(0);
        numbers.add(15);
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(6);
        
        for (int i = 0; i < numbers.size() ; i++) {

            if (numbers.get(i) > 0 && numbers.get(i) < 10) {
                nextNumbers.add(numbers.get(i));
            }
        }

        //System.out.println(numbers);
        System.out.println(nextNumbers);

    }
}
