package lesson6;

abstract class Animals {
    private static int animalCounter;
    public String name;
    public int runLimit;
    public int swimLimit;
    public final String view;


    public Animals(int runLimit, int swimLimit, String view, String name) {

        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.view = view;
        this.name = name;
        animalCounter++;
    }

    public void run(int runDis) {
        if ((runDis >= 0) && (runDis == runLimit))
            System.out.println("*"+view + " " + name + " " + "  пробежала " + runDis + "м. МОЛОДЕЦ!");
        else if ((runDis >= 0) && (runDis > runLimit))
            System.out.println("*"+view + " " + name + " " + "пробежала больше" + " " + runLimit + "м," + " "
                    + "не смогла вовремя остановиться ." + "УВЛЕКЛАСЬ!");

        if ((runDis >= 0) && (runDis < runLimit))
            System.out.println("*"+view + " " + name + " " + "пробежала всего" + " " + runDis + "м из" + " " + runLimit + "м и проиграла!" + " " + "УВЫ!");
    }

    public void swim(int swimDis) {

        if ((swimDis >= 0) && (swimDis == swimLimit))
            System.out.println("*"+view + " " + name + " " + " проплыла " + swimDis
                    + "м. МОЛОДЕЦ!");
        else if ((swimDis >= 0) && (swimDis > swimLimit))
            System.out.println("*"+view + " " + name + " " + "пробежала больше" + " " + swimLimit + "м," + " "
                    + "не смогла вовремя остановиться . " + "УВЛЕКЛАСЬ!");
        if ((swimDis >= 0) && (swimDis < swimLimit))
            System.out.println("*"+view + " " + name + " " + "проплыла всего" + " " + swimDis + "м из " + swimLimit + "м и поиграла!" + " " + "УВЫ!");

    }

    public static int getAnimalCounter() {
        return animalCounter;
    }
}
