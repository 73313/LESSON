package lesson6;

public class Cat extends Animals {
    private static int catCounter;


    public Cat(int runLimit, int swimLimit, String view, String name) {
        super(runLimit, swimLimit, view, name);
        catCounter++;
    }

    @Override
    public void swim(int swimDis) {
        System.out.println("*"+"Ничего не вышло!" + " " + view + " " + "не умеет плавать)))");
    }

    public static int getCatCounter() {
        return catCounter;

    }
}
