public class Conjured extends GildedRose {

    public Conjured(String name, int quality, int daysRemaining) {
        super(name, quality, daysRemaining);
    }

    public void tick() {
        daysRemaining -= 1;
        if (quality > 0) {
            quality -= 1;
            if (quality > 0) {
                quality -= 1;
            }
        }
        if (daysRemaining <= 0 && quality > 0) {
            quality -= 2;
        }
    }

    public int getQuality() {
        return quality;
    }

    public int getDaysRemaining() {
        return daysRemaining;
    }
}
