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

public class lonelyinteger {


    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        // int res = 0;
        //int uniqueN = 0;
        List<Integer> res = new ArrayList<Integer>();
        for(int i =0; i<a.size();i++){
            if ( res.contains(a.get(i)))
                res.remove(a.get(i));
            else
                res.add(a.get(i));
        }

        System.out.println(res);
        return res.get(0);

    }

    public static void main(String[] args) throws IOException {
      //  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      //  int n = Integer.parseInt(bufferedReader.readLine().trim());

      //  List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
      //          .map(Integer::parseInt)
      //          .collect(toList());
       // List<Integer> arr =  Arrays.asList(15, 60,74 ,1 ,94 ,93 ,28, 48 ,70, 98, 45, 94 ,42, 45, 48, 1, 72, 9 ,24, 93, 41, 70, 60, 28, 11 ,20 ,72, 35, 11, 98, 31, 74, 31, 41, 9 ,42, 20, 35, 24);
        List<Integer> arr =  Arrays.asList(84, 48 ,13, 20 ,61, 20 ,33 ,97, 34 ,45 ,6, 63 ,71, 66, 24, 57, 92 ,74 ,6 ,25, 51, 86 ,48, 15 ,
         64 ,55 ,77 ,30, 56, 53 ,37, 99 ,9 ,59, 57, 61, 30 ,97, 50, 63, 59, 62, 39, 32, 34, 4 ,96, 51 ,8 ,86 ,10, 62,
                16,55 ,81 ,88, 71 ,25 ,27, 78 ,79 ,88, 92 ,50, 16, 8, 67, 82 ,67, 37, 84 ,3, 33, 4, 78, 98, 39, 64 ,98, 94, 24 ,82 ,45, 3, 53, 74 ,96, 9 ,10, 94, 13 ,79, 15, 27, 56, 66, 32, 81 ,77);

        lonelyinteger.lonelyinteger(arr);
      //  System.out.println(result);
       // bufferedWriter.write(String.valueOf(result));
     //   bufferedWriter.newLine();

       // bufferedReader.close();
        //bufferedWriter.close();

      /*  List<Integer> uniqueN = new ArrayList<Integer>();
        for(int i =0; i<arr.size();i++){
            if (!uniqueN.contains(arr.get(i)) && arr.get(i) != 0 ) uniqueN.add(arr.get(i)) ;
        }
        System.out.println(uniqueN);

        System.out.println(uniqueN.size());*/
        //return uniqueN.size();
    }
}
