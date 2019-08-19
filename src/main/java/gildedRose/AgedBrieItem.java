package gildedRose;

public class AgedBrieItem implements RoseUpdater {

    @Override
    public void updateQuality(Item item) {
        item.decreaseSellIn();
        if (item.getQuality() < MAX_QUALITY) {
            item.increaseQuality();
        }
        if (item.getSellIn() < MIN_SELLIN && item.getQuality() < MAX_QUALITY) {
            item.increaseQuality();
        }
    }
}
