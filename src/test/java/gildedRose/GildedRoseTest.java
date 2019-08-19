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

        assertEquals(0, items[0].quality);
        assertEquals(0, items[0].sellIn);
    }

    @Test
    public void when_updateQuality_given_item_name_is_else_and_quality_is_1_and_sell_is_2() {
        Item[] items = {new Item("else", 2, 1)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, items[0].quality);
        assertEquals(1, items[0].sellIn);
    }

    @Test
    public void when_updateQuality_given_item_name_is_else_and_quality_is_2_and_sell_is_1() {
        Item[] items = {new Item("else", 1, 2)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(1, items[0].quality);
        assertEquals(0, items[0].sellIn);
    }

    @Test
    public void when_updateQuality_given_item_name_is_else_and_quality_is_2_and_sell_is_2() {
        Item[] items = {new Item("else", 0, 2)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, items[0].quality);
        assertEquals(-1, items[0].sellIn);
    }

    @Test
    public void when_updateQuality_given_item_name_is_AGED_BRIE_and_quality_is_50_and_sell_is_1() {
        Item[] items = {new Item(AGED_BRIE, 1, 50)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].quality);
        assertEquals(0, items[0].sellIn);
    }

    @Test
    public void when_updateQuality_given_item_name_is_AGED_BRIE_and_quality_is_49_and_sell_is_1() {
        Item[] items = {new Item(AGED_BRIE, 1, 49)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].quality);
        assertEquals(0, items[0].sellIn);
    }

    @Test
    public void when_updateQuality_given_item_name_is_AGED_BRIE_and_quality_is_48_and_sell_is_1() {
        Item[] items = {new Item(AGED_BRIE, 1, 48)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(49, items[0].quality);
        assertEquals(0, items[0].sellIn);
    }


    @Test
    public void when_updateQuality_given_item_name_is_AGED_BRIE_and_quality_is_48_and_sell_is_0() {
        Item[] items = {new Item(AGED_BRIE, 0, 48)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].quality);
        assertEquals(-1, items[0].sellIn);
    }

    @Test
    public void when_updateQuality_given_item_name_is_AGED_BRIE_and_quality_is_49_and_sell_is_0() {
        Item[] items = {new Item(AGED_BRIE, 0, 49)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].quality);
        assertEquals(-1, items[0].sellIn);
    }

    @Test
    public void when_updateQuality_given_item_name_is_AGED_BRIE_and_quality_is_50_and_sell_is_0() {
        Item[] items = {new Item(AGED_BRIE, 0, 50)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].quality);
        assertEquals(-1, items[0].sellIn);
    }

    @Test
    public void when_updateQuality_given_item_name_is_BACKSTAGE_PASSES_and_quality_is_50_and_sell_is_0() {
        Item[] items = {new Item(BACKSTAGE_PASSES, 0, 50)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, items[0].quality);
        assertEquals(-1, items[0].sellIn);
    }

    @Test
    public void when_updateQuality_given_item_name_is_BACKSTAGE_PASSES_and_quality_is_50_and_sell_is_1() {
        Item[] items = {new Item(BACKSTAGE_PASSES, 1, 50)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].quality);
        assertEquals(0, items[0].sellIn);
    }

    @Test
    public void when_updateQuality_given_item_name_is_BACKSTAGE_PASSES_and_quality_is_49_and_sell_is_1() {
        Item[] items = {new Item(BACKSTAGE_PASSES, 1, 49)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].quality);
        assertEquals(0, items[0].sellIn);
    }

    @Test
    public void when_updateQuality_given_item_name_is_BACKSTAGE_PASSES_and_quality_is_48_and_sell_is_1() {
        Item[] items = {new Item(BACKSTAGE_PASSES, 1, 48)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].quality);
        assertEquals(0, items[0].sellIn);
    }

    @Test
    public void when_updateQuality_given_item_name_is_BACKSTAGE_PASSES_and_quality_is_47_and_sell_is_1() {
        Item[] items = {new Item(BACKSTAGE_PASSES, 1, 47)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].quality);
        assertEquals(0, items[0].sellIn);
    }
}
