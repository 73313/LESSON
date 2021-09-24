package lesson7;

public class Plate {
    //public int food;
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        if (food >= appetite)
            food -= appetite;

    }

    public int getFood() {
        return food;
    }


    public void addFood(int additive) {
        food += additive;
        System.out.println("Маловато будет! Насыпим ещё корма" + " " + additive + "гр");

    }

    public void info() {
        System.out.println("Количество еды" + " " + food + "гр");
    }

    public void setFood(int food) {
        this.food = food;
    }
}
