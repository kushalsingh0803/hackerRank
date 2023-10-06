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

public class SherlockAndValidString {

    public static String isValid(String s) {
        // Write your code here
       int res = 0;
        Map <Character,Integer> charCountMapS = new HashMap<>();
        for ( char c : s.toCharArray()){
            if (charCountMapS.containsKey(c)) {
                charCountMapS.put(c, charCountMapS.get(c) + 1);
            }
            else {
                charCountMapS.put(c, 1);
            }

        }

        int firstCount = charCountMapS.get(s.charAt(0));
        for (Map.Entry<Character, Integer> entry : charCountMapS.entrySet()) {
            // System.out.println(entry.getKey());
            //  System.out.println(entry.getValue());
            if (firstCount != entry.getValue()) {
                res++;
                if (res == 2) {
                    System.out.println(charCountMapS);
                    return "No";
                }
            }

        }

  return "YES";
    }

    public static void main(String[] args) throws IOException {
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();*/

        String result = SherlockAndValidString.isValid("abcdefghhgfedecba");
        System.out.println(result);
       /* bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}
