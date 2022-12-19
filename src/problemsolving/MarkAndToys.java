package problemsolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MarkAndToys {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double negativeCount = 0;
        double positiveCount = 0;
        double zeroCount = 0;
        double listSize = arr.size();
        for (int i = 0; i < listSize; i++) {
            if (arr.get(i) < 0) {
                negativeCount++;
            } else if (arr.get(i) == 0) {
                zeroCount++;
            } else {
                positiveCount++;
            }
        }
        System.out.print((positiveCount / listSize) + "\n" + (negativeCount / listSize) + "\n" + (zeroCount / listSize));

    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        MarkAndToys.plusMinus(arr);

        bufferedReader.close();
    }
}

