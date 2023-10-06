package Hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DynamicArray {

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here


        int lastAnswer = 0;
        List<Integer> res = new ArrayList<>();
        List<List<Integer>> tmparr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tmparr.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < queries.size(); i++) {
            List<Integer> query = queries.get(i);
            int idx = query.get(0);
            int x = query.get(1);
            int y = query.get(2);
            if (idx == 1) {
                idx = (x ^ lastAnswer) % n;
                tmparr.get(idx).add(y);
            } else {
                idx = (x ^ lastAnswer) % n;
                lastAnswer = tmparr.get(idx).get(y % (tmparr.get(idx).size()));
                res.add(lastAnswer);
            }
        }
        return res;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = DynamicArray.dynamicArray(n, queries);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

}
