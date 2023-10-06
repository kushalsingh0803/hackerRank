package Hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockandArray {

    public static String balancedSums(List<Integer> arr) {
        // Write your code here

        int sumT = 0;
        int sumR = 0;
        int sumL = 0;
        for(int i : arr){
            sumT += i;
        }

        for(int i = 0; i < arr.size(); i++){
            sumR = sumT - sumL - arr.get(i);
            if(sumL == sumR) return "YES";
            sumL += arr.get(i);
        }
        return "NO";


    }

    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        for (int TItr = 0; TItr < T; TItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrTemp[i]);
                arr.add(arrItem);
            }*/
        List<Integer> arr = Arrays.asList();
            String result = SherlockandArray.balancedSums(arr);
/*
            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}
