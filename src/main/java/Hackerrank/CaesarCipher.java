package Hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CaesarCipher {

    public static String caesarCipher(String s, int k) {
        // Write your code here
         int inc= k%26;
        StringBuilder res = new StringBuilder();
        for( char ch : s.toCharArray()){
            if( ch >= 'a' && ch <= 'z') {
                if ((ch + k) > 122) res.append((char) (ch + k - 26));
                else res.append((char) (ch + k));
            }
            else if( ch >= 'A' && ch <= 'Z') {
                if ((ch + k) > 90) res.append((char) (ch + k - 26));
                else res.append((char) (ch + k));
            }
            else
            res.append((char)(ch));

        }

        System.out.println(res);
        return "YES";

    }


    public static void main(String[] args) throws IOException {
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());*/

        String result = CaesarCipher.caesarCipher("abcdefghijklmnopqrstuvwxyz", 3);

       /* bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}
