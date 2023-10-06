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

public class timeConversion {



    public static String timeConversion(String s) {
        // Write your code here
        String result = null;
        String abc ="abcddf";
        System.out.println(abc.charAt(0));
        if (s.substring(8).equals("PM")){

            if (s.substring(0,2).equals("12")) result = s.substring(0,8);
            else result =( (Integer.parseInt(s.substring(0,2))+12 ) + s.substring(2,8));
        }
        else {
            if (s.substring(0,2).equals("12")) result = ( "00"+ s.substring(2,8));
            else result =s.substring(0,8);

        }
        System.out.println(result);
        return result;
    }




    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       // String s = bufferedReader.readLine();
        String s = "12:01:00PM";
        String result = timeConversion.timeConversion(s);

       // bufferedWriter.write(result);
       // bufferedWriter.newLine();

        bufferedReader.close();
       // bufferedWriter.close();
    }
}

