package Hackerrank;
import java.io.*;

import java.util.*;

import java.util.stream.*;

import static java.util.stream.Collectors.toList;
public class miniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {

        arr.sort(Comparator.naturalOrder());
        String abc ="23";
        System.out.println((abc.charAt(0)));

        System.out.println(arr);
        long max =0;
        long min =0;
        for ( int i =0; i < arr.size();i++){
            if (i != 0) max = max+arr.get(i);
            if (i != arr.size()-1) min = min+arr.get(i);
           // System.out.println(arr.get(i));
            System.out.println(min + " "+ max);
            System.out.println(1806395719+938071625);
        }
        System.out.println(min + " "+ max);
//2063136757 2744467344
    }




    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr =  Arrays.asList(256741038 , 623958417 ,467905213 ,714532089 ,938071625);

        miniMaxSum.miniMaxSum(arr);

        bufferedReader.close();
    }
}

