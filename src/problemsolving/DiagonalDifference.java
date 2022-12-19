package problemsolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = DiagonalDifference.diagonalDifference(arr);

        System.out.println("result : " + result);

        bufferedReader.close();
    }


    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int listSize = arr.get(0).size();
        int a = 0;
        int b = 0;
        for (int i = 0, j = listSize - 1; i < listSize; i++, j--) {
            a += arr.get(i).get(i);
            b += arr.get(i).get(j);
        }
        int result = a - b;
        if (result < 0) {
            result = result * -1;
        }
        return result;
    }
}
