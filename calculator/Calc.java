package calculator;

import java.util.Arrays;

public class Calc {

    public static double calculateMean(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static double calculateStandardDeviation(double[] numbers, double mean) {
        double sumSquaredDifferences = 0;
        for (double num : numbers) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDifferences / numbers.length);
    }

    public static double calculateMedian(double[] numbers) {
        Arrays.sort(numbers);
        int n = numbers.length;
        if (n % 2 == 0) {
            return (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0;
        } else {
            return numbers[n / 2];
        }
    }
}