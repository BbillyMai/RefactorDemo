package gildedRose;

public class AgedBrieItem implements RoseUpdater {

    @Override
    public void updateQuality(Item item) {
        item.setSellIn(item.getSellIn() - 1);
        if (item.getQuality() < MAX_QUALITY) {
            item.setQuality(item.getQuality() + 1);
        }
        if (item.getSellIn() < MIN_SELLIN && item.getQuality() < MAX_QUALITY) {
            item.setQuality(item.getQuality() + 1);
        }
    }
}
