import calculator.Calc;
import java.util.Scanner;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers:");
        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");
        double[] numbers = Arrays.stream(inputArray).mapToDouble(Double::parseDouble).toArray();

        double mean = Calc.calculateMean(numbers);
        double stdDev = Calc.calculateStandardDeviation(numbers, mean);
        double median = Calc.calculateMedian(numbers);

        System.out.println("arithmetic mean: " + mean);
        System.out.println("standard deviation: " + stdDev);
        System.out.println("median: " + median);
    }
}