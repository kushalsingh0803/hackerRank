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


public class BigSorting {

    public static List<String> bigSorting(List<String> unsorted) {
        // Write your code here
        unsorted.sort( new Comparator<String>()  {
            @Override
            public int compare(String a, String b)
            {
                if(a.length() > b.length()) return 1;
                if(a.length() < b.length()) return -1;
                for(int i = 0; i < a.length(); i++)
                {
                    if((int)a.charAt(i) > (int)b.charAt(i)) return 1;
                    if((int)a.charAt(i) < (int)b.charAt(i)) return -1;
                }
                return 0;
            }
        });

        StringBuilder output = new StringBuilder("");
        for(String num : unsorted)
            output.append(num+"\n");
        System.out.println(output);
        return unsorted;



    }
    static int compare(String a, String b)
    {
        if(a.length() > b.length()) return 1;
        if(a.length() < b.length()) return -1;
        for(int i = 0; i < a.length(); i++)
        {
            if((int)a.charAt(i) > (int)b.charAt(i)) return 1;
            if((int)a.charAt(i) < (int)b.charAt(i)) return -1;
        }
        return 0;
    }


    public static void main(String[] args) throws IOException {
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> unsorted = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());*/
        List<String> arr = Arrays.asList("31415926535897932384626433832795","1", "3", "10", "3", "5");
        List<String> result = BigSorting.bigSorting(arr);

        /*bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}
