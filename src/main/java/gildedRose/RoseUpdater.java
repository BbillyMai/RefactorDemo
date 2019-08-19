package gildedRose;

public interface RoseUpdater {
    int MAX_QUALITY = 50;
    int MIN_QUALITY = 0;
    int MAX_SELLIN = 11;
    int SECOND_MAX_SELLIN = 6;
    int MIN_SELLIN = 0;

    void updateQuality(Item item);
}
