package gildedRose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {
    private final String AGED_BRIE = "Aged Brie";
    private final String BACKSTAGE_PASSES = "BackstageItem passes to a TAFKAL80ETC concert";
    private final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    @Test
    public void when_updateQuality_given_item_name_is_else_and_quality_is_1_and_sell_is_1() {
        Item[] items = {new Item("else", 1, 1, new BaseItem())};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, items[0].getQuality());
        assertEquals(0, items[0].getSellIn());
    }

    @Test
    public void when_updateQuality_given_item_name_is_else_and_quality_is_1_and_sell_is_2() {
        Item[] items = {new Item("else", 2, 1, new BaseItem())};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, items[0].getQuality());
        assertEquals(1, items[0].getSellIn());
    }

    @Test
    public void when_updateQuality_given_item_name_is_else_and_quality_is_2_and_sell_is_1() {
        Item[] items = {new Item("else", 1, 2, new BaseItem())};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(1, items[0].getQuality());
        assertEquals(0, items[0].getSellIn());
    }

    @Test
    public void when_updateQuality_given_item_name_is_else_and_quality_is_2_and_sell_is_2() {
        Item[] items = {new Item("else", 0, 2, new BaseItem())};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, items[0].getQuality());
        assertEquals(-1, items[0].getSellIn());
    }

    @Test
    public void when_updateQuality_given_item_name_is_AGED_BRIE_and_quality_is_50_and_sell_is_1() {
        Item[] items = {new Item(AGED_BRIE, 1, 50, new AgedBrieItem())};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].getQuality());
        assertEquals(0, items[0].getSellIn());
    }

    @Test
    public void when_updateQuality_given_item_name_is_AGED_BRIE_and_quality_is_49_and_sell_is_1() {
        Item[] items = {new Item(AGED_BRIE, 1, 49, new AgedBrieItem())};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].getQuality());
        assertEquals(0, items[0].getSellIn());
    }

    @Test
    public void when_updateQuality_given_item_name_is_AGED_BRIE_and_quality_is_48_and_sell_is_1() {
        Item[] items = {new Item(AGED_BRIE, 1, 48, new AgedBrieItem())};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(49, items[0].getQuality());
        assertEquals(0, items[0].getSellIn());
    }


    @Test
    public void when_updateQuality_given_item_name_is_AGED_BRIE_and_quality_is_48_and_sell_is_0() {
        Item[] items = {new Item(AGED_BRIE, 0, 48, new AgedBrieItem())};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].getQuality());
        assertEquals(-1, items[0].getSellIn());
    }

    @Test
    public void when_updateQuality_given_item_name_is_AGED_BRIE_and_quality_is_49_and_sell_is_0() {
        Item[] items = {new Item(AGED_BRIE, 0, 49, new AgedBrieItem())};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].getQuality());
        assertEquals(-1, items[0].getSellIn());
    }

    @Test
    public void when_updateQuality_given_item_name_is_AGED_BRIE_and_quality_is_50_and_sell_is_0() {
        Item[] items = {new Item(AGED_BRIE, 0, 50, new AgedBrieItem())};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].getQuality());
        assertEquals(-1, items[0].getSellIn());
    }

    @Test
    public void when_updateQuality_given_item_name_is_BACKSTAGE_PASSES_and_quality_is_50_and_sell_is_0() {
        Item[] items = {new Item(BACKSTAGE_PASSES, 0, 50, new BackstageItem())};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, items[0].getQuality());
        assertEquals(-1, items[0].getSellIn());
    }

    @Test
    public void when_updateQuality_given_item_name_is_BACKSTAGE_PASSES_and_quality_is_50_and_sell_is_1() {
        Item[] items = {new Item(BACKSTAGE_PASSES, 1, 50, new BackstageItem())};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].getQuality());
        assertEquals(0, items[0].getSellIn());
    }

    @Test
    public void when_updateQuality_given_item_name_is_BACKSTAGE_PASSES_and_quality_is_49_and_sell_is_1() {
        Item[] items = {new Item(BACKSTAGE_PASSES, 1, 49, new BackstageItem())};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].getQuality());
        assertEquals(0, items[0].getSellIn());
    }

    @Test
    public void when_updateQuality_given_item_name_is_BACKSTAGE_PASSES_and_quality_is_48_and_sell_is_1() {
        Item[] items = {new Item(BACKSTAGE_PASSES, 1, 48, new BackstageItem())};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].getQuality());
        assertEquals(0, items[0].getSellIn());
    }

    @Test
    public void when_updateQuality_given_item_name_is_BACKSTAGE_PASSES_and_quality_is_47_and_sell_is_1() {
        Item[] items = {new Item(BACKSTAGE_PASSES, 1, 47, new BackstageItem())};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].getQuality());
        assertEquals(0, items[0].getSellIn());
    }

    @Test
    public void when_updateQuality_given_item_name_is_SULFURAS_and_quality_is_48_and_sell_is_Minus_one() {
        Item[] items = {new Item(SULFURAS, -1, 48, new SulfurasItem())};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(48, items[0].getQuality());
        assertEquals(-1, items[0].getSellIn());
    }

    @Test
    public void when_updateQuality_given_item_name_is_SULFURAS_and_quality_is_48_and_sell_is_0() {
        Item[] items = {new Item(SULFURAS, 0, 48, new SulfurasItem())};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(48, items[0].getQuality());
        assertEquals(0, items[0].getSellIn());
    }

}
