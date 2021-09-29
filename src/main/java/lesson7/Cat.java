package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isNotHungry;





    public Cat(String name, int appetite) {

        this.name = name;
        this.appetite = appetite;
        this.isNotHungry = false;

    }
    public void infoCat() {
        System.out.println("Кот" + " " + name + " " + "съел" + " " + appetite + "гр"
                + ",и он наелся" + "=" + isNotHungry);

    }

    public void eat(Plate plate) {
        if (plate.getFood() > appetite) {
            plate.decreaseFood(appetite);
            isNotHungry = true;
        } else {
            System.out.println("Котик" + " " + name + " " + " не поел совсем!");

        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;

    }
    public boolean isNotHungry() {
        return isNotHungry;
    }
    public void setNotHungry(boolean notHungry) {
        isNotHungry = notHungry;
    }
}
