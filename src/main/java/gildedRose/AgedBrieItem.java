package gildedRose;

public class AgedBrieItem implements RoseUpdater {

    @Override
    public void updateQuality(Item item) {
        item.sellIn = item.sellIn - 1;
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
        if (item.sellIn < 0 && item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}
