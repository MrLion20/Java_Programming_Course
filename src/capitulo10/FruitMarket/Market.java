package capitulo10.FruitMarket;

public class Market {

    public static void main(String[] args){

        Fruit apple = new Apple();
        ((Apple) apple).removeSeeds();

        Apple apple1 = new Apple();
        apple1.setCalories(45.3);
        apple1.removeSeeds();

        Banana banana = new Banana();
        banana.peel();

        Fruit banana2 = new Banana();
        ((Banana) banana2).peel();

        Fruit fresa = new Fruit();
        fresa.setCalories(20.0);


        squeeze(apple);
        squeeze(apple1);
        squeeze(banana);
        squeeze(banana2);
        squeeze(fresa);

    }

    public static void squeeze(Fruit fruit){
        System.out.print("Squeezing...");
        fruit.makeJuice();
    }
}
