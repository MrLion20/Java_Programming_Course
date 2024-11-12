package capitulo9;

public class TasteTester {
    public static void main(String[] args){

        Cake cake = new Cake("chocolate");
        cake.setPrice(29.99);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(5.000);

        System.out.println(birthdayCake.getFlavor());
        System.out.println(birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setPrice(10.000);

        System.out.println(weddingCake.getFlavor());
        System.out.println(weddingCake.getPrice());

    }



}
