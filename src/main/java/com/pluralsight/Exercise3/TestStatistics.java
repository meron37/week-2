package com.pluralsight.Exercise3;
import java.util.Arrays;

public class TestStatistics {

    public static void main(String[] args) {

        int compare[] = {24, 34, 23, 43, 56, 34, 35, 22, 67, 78};
        float sum = 0;
        float avg;
        int max = compare[0];
        int min = compare[0];
        int length = compare.length;

        // calculate the sum
        for (int num : compare) {   // changed compares → compare
            sum += num;
        }

        avg = sum / length;

        // find the max and min
        for (int num : compare) {   // changed compares → compare
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
    // sort the array to find the median
        Arrays.sort(compare);

        double median;
        if (length % 2 == 0) {
            // even number of elements → average of two middle values
            median = (compare[length / 2 - 1] + compare[length / 2]) / 2.0;
        } else {
            // odd number of elements → middle element
            median = compare[length / 2];
        }
        // print results
        System.out.println("The average is: " + String.format("%.2f", avg));
        System.out.println("The max is: " + max);
        System.out.println("The min is: " + min);
        double difference = Math.abs(avg - median);
        System.out.println("The median is: " + String.format("%.2f", difference));
    }
}
