package Hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class GridChallenge {

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        String res = "YES";
        for (int i = 0; i < grid.size(); i++) {
            char tempArray[] = grid.get(i).toCharArray();
            Arrays.sort(tempArray);
            grid.set(i, new String(tempArray));
        }
        for (int i = 0; i < grid.get(0).length(); i++) {
            System.out.println("ndgjkfjgf");
            for (int j = 0; j < grid.size() - 1; j++) {
                System.out.println((int)grid.get(j).charAt(i) );
                System.out.println((int)grid.get(j+1).charAt(i) );
                if ((int)grid.get(j).charAt(i) > (int)grid.get(j+1).charAt(i)) {
                    System.out.println("NO");
                    return "NO";
                }

            }


        }
        System.out.println("YES");
        return "YES";
    }

    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<String> grid = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String gridItem = bufferedReader.readLine();
                grid.add(gridItem);
            }*/
            List<String> grid = Arrays.asList("mpxz", "abcd" , "wlmf");
            String result = GridChallenge.gridChallenge(grid);

           // bufferedWriter.write(result);
          //  bufferedWriter.newLine();
        }

      //  bufferedReader.close();
       // bufferedWriter.close();
    }

