package gildedRose;

public class BaseItem implements RoseUpdater {

    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() > MIN_QUALITY) {
            item.setQuality(item.getQuality() - 1);
        }
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < MIN_SELLIN && item.getQuality() > MIN_QUALITY) {
            item.setQuality(item.getQuality() - 1);
        }
    }

}
