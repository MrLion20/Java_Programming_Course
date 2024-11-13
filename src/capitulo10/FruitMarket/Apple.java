package capitulo10.FruitMarket;

public class Apple extends Fruit {

    public Apple() {
        setCalories(45.0);
    }

    public void removeSeeds(){
        System.out.println("Time to remove seeds of the apple");
    }

    @Override
    public void makeJuice(){
        System.out.println("Time to make apple Juice");
    }
}
