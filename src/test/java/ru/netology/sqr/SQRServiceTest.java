package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void shouldCalcExact(int expected, int num1, int num2) {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(num1, num2);

        Assertions.assertEquals(expected, actual);
    }
}
