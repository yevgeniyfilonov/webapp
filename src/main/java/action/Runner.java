package action;

import java.util.StringTokenizer;

public class Runner {
    public static void main(String[] args) {
        String s = "Строка, которую мы хотим разобрать на слова";

        StringTokenizer st = new StringTokenizer(s, " \t\n\r,.");

        while(st.hasMoreTokens()){

            System.out.println(st.nextToken()) ;

        }


    }

}
