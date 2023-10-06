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

public class BalancedBrackets {


    public static String isBalanced(String s) {
        // Write your code here
        Stack<Character> st = new Stack<>();
         for(char ch: s.toCharArray()) {
             if (ch == '(' || ch == '{' || ch == '[') {
                 st.push(ch);
             }

             if (ch == ')' || ch == '}' || ch == ']') {
                 if(st.empty()) return "NO";
                 char prevCH=  st.pop();

                 switch (ch) {
                     case ')':
                         if ('(' != prevCH) return "NO";
                         break;
                     case '}':
                         if ('{' != prevCH) return "NO";
                         break;
                     case ']':
                         if ('[' != prevCH) return "NO";
                         break;

                 }

             }
         }
         return (st.size() == 0 ) ? "YES" : "NO";


    }



    public static void main(String[] args) throws IOException {
      /*  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();*/

        String result = BalancedBrackets.isBalanced("]({}{()}[}}[]{]([]{}({({(][})}{)[[(})][)})(){(}{){]][(}(][{[])(]]([[{{(]]{}([}]]){[[({]}[(}][(]){[]}])}{]])][([][([)]{[}()])}[{][]{{(]{[][){[)([}]}[{}(({{({)}()}}{{{{}[}]}){})[((}[[}[[}(\n" +
                "}[(]}[][)({]([][)}[)[]))({(]}{}][)[]()})})}{{{{{}{])(}[}][{({][))}[{]]]])[[){(()}}})){[]](([{]([}}])((}{}}(]}])])]{[]}{){[{{]([]})[}})]()({[([}(]{}){)))[({(]{})(({{}({{[{[{))()]{(([)])[{]}]))(]{}}[}[{()))())[{}]]])][])}{]][)]]])[}{]}{}[[{[]]({(()))(](}}}][}}}{]}(}){}}}{({}[{(]}[[[]({}{}}}}}{))[}))][}((([}[)}[({}[]}[[]}[]([]{(]{]}])]]){[(]}{)()((}){][{]}[{){}{){}{[])}}(}((}]([({}](]}}[{}{]}({)]{[]]}((](}{[[]{))[]{{{{])[{(}{({]}}}})[]}{)][){]}({]]]}{{{}[](}}({{{])][[{}[]]}[[}{}{[[(])([{()){(){]](}}}((]]{]]{([]({)(}](]}}{))]{](){([}}})}{[{([[]])(}{(]{)][))))]}[{({(}({]{[)}][]}]{)()(])((}{)]()({)}({}[]{(](){}({[}{){](})]]([([[[{}[()]{{{(]()}{)(})[[{{}(])(][((]]){(]}");
        System.out.println(result);
    }
}
