package gildedRose;

public class BackstageItem implements RoseUpdater {

    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() < MAX_QUALITY) {
            item.setQuality(item.getQuality() + 1);
        }

        if (item.getSellIn() < MAX_SELLIN && item.getQuality() < MAX_QUALITY) {
            item.setQuality(item.getQuality() + 1);
        }

        if (item.getSellIn() < SECOND_MAX_SELLIN && item.getQuality() < MAX_QUALITY) {
            item.setQuality(item.getQuality() + 1);
        }

        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < MIN_SELLIN) {
            item.setQuality(0);
        }
    }
}
