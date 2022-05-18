package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxAllCoverage() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        long expected = 6;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}