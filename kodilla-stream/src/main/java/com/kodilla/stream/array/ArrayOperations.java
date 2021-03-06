package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length).map(n -> numbers[n]).forEach(System.out::println);

        OptionalDouble average = IntStream.range(0, numbers.length).map(n -> numbers[n]).average();

        double jakasWartosc = 0;
        if (average.isPresent()) {
            jakasWartosc = average.getAsDouble();
            System.out.println(average.getAsDouble());
        }

        // System.out.println(average.getAsDouble());

        // return average.getAsDouble();
        return jakasWartosc;
    }
}
