package lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(200, 100, "Кошка", "Шнурок");
        Cat cat2 = new Cat(200, 100, "Кошка", "Кросс");
        Cat cat3 = new Cat(200, 100, "Кошка", "Маруся");

        Dog dog1 = new Dog(500, 10, "Собака", "Мила");
        Dog dog2 = new Dog(500, 10, "Собака", "Секрет");
        Dog dog3 = new Dog(500, 10, "Собака", "Баунти");
        System.out.println(" Сегодня в спортивных соревнованиях учавствуют " + Animals.getAnimalCounter() +
                " животных , а именно:  собак - " + Dog.getDogCounter() + ", котов - "
                + Cat.getCatCounter());
        System.out.println();
        System.out.println("Забег на" + " " + cat1.runLimit + "м у кошек (^ ^):");
        System.out.println();
        cat1.run(116);
        cat2.run(200);
        cat3.run(750);
        System.out.println();
        System.out.println("Забег на" + " " + dog1.runLimit + "м у собак:");
        System.out.println();
        dog1.run(500);
        dog2.run(400);
        dog3.run(600);
        System.out.println();
        System.out.println("Заплыв на" + " " + cat1.swimLimit + "м у кошек (^ ^) :");
        System.out.println();
        cat1.swim(0);
        cat2.swim(0);
        cat3.swim(0);
        System.out.println();
        System.out.println("Заплыв на" + " " + dog1.swimLimit + "м у собак:");
        System.out.println();
        dog1.swim(5);
        dog2.swim(15);
        dog3.swim(10);
        System.out.println();
        System.out.println("Соревнования окончены!");


    }
}

