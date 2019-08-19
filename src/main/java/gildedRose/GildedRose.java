package gildedRose;

public class GildedRose {
    private final String AGED_BRIE = "Aged Brie";
    private final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            switch (items[i].name) {
                case AGED_BRIE:
                    items[i] = doAgedBrie(items[i]);
                    break;
                case BACKSTAGE_PASSES:
                    items[i] = doBackstage(items[i]);
                    break;
                case SULFURAS:
                    break;
                default:
                    items[i] = doElse(items[i]);
                    break;
            }
        }
    }

    private Item doElse(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality = item.quality - 1;
        }
        return item;
    }

    private Item doBackstage(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }

        if (item.sellIn < 11 && item.quality < 50) {
            item.quality = item.quality + 1;
        }

        if (item.sellIn < 6 && item.quality < 50) {
            item.quality = item.quality + 1;
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            item.quality = 0;
        }
        return item;
    }

    private Item doAgedBrie(Item item) {
        item.sellIn = item.sellIn - 1;
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
        if (item.sellIn < 0 && item.quality < 50) {
            item.quality = item.quality + 1;
        }
        return item;
    }
}