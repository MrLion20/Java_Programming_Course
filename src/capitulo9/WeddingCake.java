package capitulo9;

public class WeddingCake extends Cake{
    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    private int tiers;

    public WeddingCake(){
        super("Vainilla");
    }

}
