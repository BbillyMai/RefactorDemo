package gildedRose;

public class Item {

    private String name;

    private int sellIn;

    private int quality;

    private RoseUpdater roseUpdater;

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

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
