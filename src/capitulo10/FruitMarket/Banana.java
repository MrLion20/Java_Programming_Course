package capitulo10.FruitMarket;

public class Banana extends Fruit{
    public Banana() {
        setCalories(105.0);
    }

    public void peel(){
        System.out.println("Time to peel a banana");
    }

    @Override
    public void makeJuice(){
        System.out.println("Banana juice is not good");
    }
}
