package gildedRose;

public class BackstageItem implements RoseUpdater {

    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() < MAX_QUALITY) {
            item.increaseQuality();
        }

        if (item.getSellIn() < MAX_SELLIN && item.getQuality() < MAX_QUALITY) {
            item.increaseQuality();
        }

        if (item.getSellIn() < SECOND_MAX_SELLIN && item.getQuality() < MAX_QUALITY) {
            item.increaseQuality();
        }

        item.decreaseSellIn();

        if (item.getSellIn() < MIN_SELLIN) {
            item.setQualityZero();
        }
    }
}
