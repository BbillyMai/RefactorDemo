package gildedRose;

public class BaseItem implements RoseUpdater {

    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() > MIN_QUALITY) {
            item.decreaseQuality();
        }
        item.decreaseSellIn();
        if (item.getSellIn() < MIN_SELLIN && item.getQuality() > MIN_QUALITY) {
            item.decreaseQuality();
        }
    }

}
