package capitulo10.FruitMarket;

public class Fruit {

    private Double Calories;

    public Double getCalories() {
        return Calories;
    }

    public void setCalories(Double calories) {
        Calories = calories;
    }

    public void makeJuice(){
        System.out.println("Time to make Juice");
    }

}
