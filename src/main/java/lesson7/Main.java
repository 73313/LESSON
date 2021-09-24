package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] x = {new Cat("Тихон", 50), new Cat("Зефир", 65),
                new Cat("Барсик", 300), new Cat("Мурзик", 42)};
        Plate plate = new Plate(400);

        plate.info();
        for (Cat c : x)
            c.infoCat();
        for (Cat c : x)
            c.eat(plate);
        plate.info();
        System.out.println();
        plate.addFood(250);
        plate.info();
        System.out.println();
        System.out.println("Котики поели ещё");
        for (Cat c : x) {
            c.eat(plate);
            c.infoCat();
            plate.info();
        }


    }
}
