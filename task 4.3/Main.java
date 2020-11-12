/*
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false.
Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
*/

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        boolean result1 = cat1.fight(cat2);
        boolean result2 = cat2.fight(cat1);

        System.out.println(result1);
        System.out.println(result2);

        System.out.println("-----");
        if (result1 == true){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}

class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int score = 0;

        if(this.age > anotherCat.age) {
            score += 1;
        } else if (this.age < anotherCat.age) {
            score += -1;
        }

        if (this.weight > anotherCat.weight) {
            score += 1;
        } else if (this.weight < anotherCat.weight) {
            score += -1;
        }

        if (this.strength > anotherCat.strength){
            score += 1;
        } else if (this.strength < anotherCat.strength){
            score += -1;
        }

        return score > 0;
    }

}
