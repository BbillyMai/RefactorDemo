package gildedRose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {
    private final String AGED_BRIE = "Aged Brie";
    private final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    @Test
    public void when_updateQuality_given_item_name_is_else_and_quality_is_1_and_sell_is_1() {
        Item[] items = {new Item("else", 1, 1)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0,items[0].quality);
        assertEquals(0,items[0].sellIn);
    }

    @Test
    public void when_updateQuality_given_item_name_is_else_and_quality_is_1_and_sell_is_2() {
        Item[] items = {new Item("else", 2, 1)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0,items[0].quality);
        assertEquals(1,items[0].sellIn);
    }

    @Test
    public void when_updateQuality_given_item_name_is_else_and_quality_is_2_and_sell_is_1() {
        Item[] items = {new Item("else", 1, 2)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(1,items[0].quality);
        assertEquals(0,items[0].sellIn);
    }

    @Test
    public void when_updateQuality_given_item_name_is_else_and_quality_is_2_and_sell_is_2() {
        Item[] items = {new Item("else", 2, 2)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(1,items[0].quality);
        assertEquals(1,items[0].sellIn);
    }


}
