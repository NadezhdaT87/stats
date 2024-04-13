package ru.netology.stats.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void shouldSummaSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.calculateSumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test

    public void shouldAverageSumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.findAverage(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test

    public void shouldMaxMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.findMaxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test

    public void shouldMinMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.findMinSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test

    public void shouldSumMinMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumMinMonthSales = 5;
        int actualSumMinMonthSales = service.minSumMonthSales(sales);

        Assertions.assertEquals(expectedSumMinMonthSales, actualSumMinMonthSales);
    }

    @Test

    public void shouldSumMaxMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumMaxMonthSales = 7;
        int actualSumMaxMonthSales = service.maxMonthSales(sales);

        Assertions.assertEquals(expectedSumMaxMonthSales, actualSumMaxMonthSales);
    }


}
