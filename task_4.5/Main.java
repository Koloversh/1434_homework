/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/

public class Main{
    public static void main(String[] args) {

        Horse horse = new Horse("Конь");
        horse.run();

        Pegasus pegasus = new Pegasus("Пегас");
        pegasus.fly();

    }
}

abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Horse extends Animal {
    public Horse (String name){
        super(name);
    }

    public void run(){
        System.out.println("Конь конечно 'Тыгыдык - тыгыдык - тыгыдык'");
    }
}

class Pegasus extends Horse {
    public Pegasus (String name){
        super(name);
    }

    public void fly() {
        System.out.println("А Пегас " + "'Крылышкам хлоп-хлоп', но аэродинамика работает не так.");
    }
}
