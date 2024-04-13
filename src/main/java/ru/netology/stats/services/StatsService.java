package ru.netology.stats.services;

import java.time.Month;

public class StatsService {
    public int calculateSumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAverage(int[] sales) {

        return calculateSumSales(sales) / sales.length;
    }

    public int findMaxSales(int[] sales) {
        int maxMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findMinSales(int[] sales) {
        int minMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int minSumMonthSales(int[] sales) {
        int sumMinMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < findAverage(sales)) {
                sumMinMonth += 1;
            }
        }
        return sumMinMonth;
    }

    public int maxMonthSales(int[] sales) {
        int sumMaxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= findAverage(sales)) {
                sumMaxMonth += 1;
            }
        }

        return sumMaxMonth;
    }
}

