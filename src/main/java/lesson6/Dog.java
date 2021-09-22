package lesson6;

public class Dog extends Animals {
    private static int dogCounter;


    public Dog(int runLimit, int swimLimit, String view, String name) {
        super(runLimit, swimLimit, view, name);
        dogCounter++;
    }

    public static int getDogCounter() {
        return dogCounter;
    }
}
