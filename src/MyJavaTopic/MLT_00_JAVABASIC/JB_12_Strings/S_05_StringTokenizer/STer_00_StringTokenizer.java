package MyJavaTopic.MLT_00_JAVABASIC.JB_12_Strings.S_05_StringTokenizer;

import java.util.StringTokenizer;

public class STer_00_StringTokenizer {
    public static void main(String[] args) {

        /*
        StringTokenizer
              ↓
     Break text into tokens
         */
        String text = "Java is easy";

        StringTokenizer tokenizer =
                new StringTokenizer(text);

        while (tokenizer.hasMoreTokens()) {

            System.out.println(tokenizer.nextToken());
        }

    }
}
