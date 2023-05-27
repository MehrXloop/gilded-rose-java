public class Sulfuras extends GildedRose {

    public Sulfuras(String name, int quality, int daysRemaining) {
        super(name, quality, daysRemaining);
    }

    public void tick() {
        // Sulfuras does not change, so no modifications are needed
    }

    public int getQuality() {
        return quality;
    }

    public int getDaysRemaining() {
        return daysRemaining;
    }
}
