package Hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CounterGame {

    public static String counterGame(long n) {
        // Write your code here
        int i =1;
        int turns = 0;
        while ( n != 1){
            i=1;
            while  ((Math.pow(2,i))<= n ) {
                i = i + 1;
            }
            if (Math.pow(2,i-1) == n)
                n=n/2;
            else  n = n-(long)(Math.pow(2,i-1));
            turns++;
            }
        System.out.println(turns%2==0? "Richard" : "Louise");
       return turns%2==0? "Richard" : "Louise";



        }




    public static void main(String[] args) throws IOException {
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            long n = Long.parseLong(bufferedReader.readLine().trim());
*/         long n = 6;
            String result = CounterGame.counterGame(n);
/*
            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}
