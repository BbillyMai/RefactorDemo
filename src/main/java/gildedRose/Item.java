package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public RoseUpdater roseUpdater;

    public Item(String name, int sellIn, int quality, RoseUpdater roseUpdater) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.roseUpdater = roseUpdater;
    }

    public void updateQuality() {
        roseUpdater.updateQuality(this);
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
