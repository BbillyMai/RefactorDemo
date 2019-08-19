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

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void increaseQuality() {
        quality++;
    }

    public void decreaseQuality() {
        quality--;
    }

    public void decreaseSellIn() {
        sellIn--;
    }

    public void setQualityZero() {
        quality = 0;
    }
}
